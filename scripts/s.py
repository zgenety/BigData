from pyspark.sql import SparkSession
import math
from pyspark.sql import functions as F
from pyspark.ml import Transformer
from pyspark.ml.param.shared import HasInputCol, HasOutputCols, HasInputCols

from pyspark.ml.util import DefaultParamsReadable, DefaultParamsWritable
from pyspark.sql.types import StructType, StructField, DoubleType
from pyspark.ml.feature import StandardScaler, VectorAssembler
from pyspark.ml import Pipeline
import os

from pyspark.ml.tuning import ParamGridBuilder, CrossValidator
from pyspark.ml.regression import LinearRegression
from pyspark.ml.evaluation import RegressionEvaluator
from pyspark.ml.regression import GBTRegressor


class Encoder(Transformer, HasInputCol, HasOutputCols, DefaultParamsReadable, DefaultParamsWritable):
    def __init__(self, inputCol, outputCols, n):
        super(Encoder, self).__init__()
        self._set(inputCol=inputCol, outputCols=outputCols)
        self.n = n

    def _transform(self, dataset):
        input_col = self.getInputCol()
        output_cols = self.getOutputCols()
        
        dataset = dataset.withColumn(output_cols[0], F.sin(2 * math.pi * F.col(input_col) / self.n))
        
        return dataset
    
class GeodeticToECEFTransformer(Transformer, HasInputCols, HasOutputCols, DefaultParamsReadable, DefaultParamsWritable):
    def __init__(self, inputCols=None, outputCols=None, defaultAltitude=0.0):
        super(GeodeticToECEFTransformer, self).__init__()
        self._set(inputCols=inputCols, outputCols=outputCols)
        self.defaultAltitude = defaultAltitude

    def _transform(self, dataset):
        input_cols = self.getInputCols()
        output_cols = self.getOutputCols()
        
        a = 6378137.0
        f = 1 / 298.257223563
        b = a * (1 - f)
        e2 = 1 - (b ** 2) / (a ** 2)
        
        def geodetic_to_ecef(lat, lon, alt):
            lat_rad = math.radians(lat)
            lon_rad = math.radians(lon)
            
            N = a / math.sqrt(1 - e2 * math.sin(lat_rad) ** 2)
            
            x = (N + alt) * math.cos(lat_rad) * math.cos(lon_rad)
            y = (N + alt) * math.cos(lat_rad) * math.sin(lon_rad)
            z = ((1 - e2) * N + alt) * math.sin(lat_rad)
            
            return (x, y, z)
        
        output_schema = StructType([
            StructField(output_cols[0], DoubleType(), True),
            StructField(output_cols[1], DoubleType(), True),
            StructField(output_cols[2], DoubleType(), True)
        ])
        
        geodetic_to_ecef_udf = F.udf(geodetic_to_ecef, output_schema)
        
        dataset = dataset.withColumn("ecef_coords", geodetic_to_ecef_udf(F.col(input_cols[0]), F.col(input_cols[1]), F.lit(self.defaultAltitude)))
        
        dataset = dataset.withColumn(output_cols[0], F.col("ecef_coords")[output_cols[0]])
        dataset = dataset.withColumn(output_cols[1], F.col("ecef_coords")[output_cols[1]])
        dataset = dataset.withColumn(output_cols[2], F.col("ecef_coords")[output_cols[2]])
        
        dataset = dataset.drop("ecef_coords")
        
        return dataset
    
def run(command):
    return os.popen(command).read()

team = 39

warehouse = "project/hive/warehouse"

spark = SparkSession.builder\
        .appName("{} - spark ML".format(team))\
        .master("yarn")\
        .config("hive.metastore.uris", "thrift://hadoop-02.uni.innopolis.ru:9883")\
        .config("spark.sql.warehouse.dir", warehouse)\
        .config("spark.sql.avro.compression.codec", "snappy")\
        .enableHiveSupport()\
        .getOrCreate()
        
metrics = spark.read.format("avro").table('team39_projectdb.metrics_part')
stations = spark.read.format("avro").table('team39_projectdb.stations')

df = metrics.join(stations, on='sid', how='inner')

df = df.withColumn("year", F.year("date_time"))
df = df.withColumn("month", F.month("date_time"))
df = df.withColumn("day", F.dayofmonth("date_time"))
df = df.withColumn("hour", F.hour("date_time"))
df = Encoder("month", ["month"], 12).transform(df)
df = Encoder("day", ["day"], 31).transform(df)
df = Encoder("hour", ["hour"], 24).transform(df)

df = df.withColumn("latitude", F.col("latitude").cast(DoubleType()))
df = df.withColumn("longitude", F.col("longitude").cast(DoubleType()))

df = GeodeticToECEFTransformer(
    inputCols=["latitude", "longitude"],
    outputCols=["x", "y", "z"],
    defaultAltitude=0.0
).transform(df)

feature_cols = ["so2", "co", "o3", "o3_8hr", "pm10", "pm2_5", "no2", "nox", "no", "windspeed", "winddirec", "co_8hr", "pm2_5_avg", "pm10_avg", "so2_avg", "year", "x", "y", "z"]

assembler = VectorAssembler(inputCols=feature_cols, outputCol="features")
scaler = StandardScaler(inputCol="features", outputCol="scaledFeatures", withStd=True, withMean=True)
pipeline = Pipeline(stages=[assembler, scaler])
model = pipeline.fit(df)

df = model.transform(df)

df = df.select("scaledFeatures", "aqi")

train_data, test_data = df.randomSplit([0.7, 0.3], seed=42)

train_data.select("scaledFeatures", "aqi")\
    .write\
    .mode("overwrite")\
    .format("json")\
    .save("project/data/train")
    
run("hdfs dfs -cat project/data/train/*.json > data/train.json")

test_data.select("scaledFeatures", "aqi")\
    .write\
    .mode("overwrite")\
    .format("json")\
    .save("project/data/test")
    
run("hdfs dfs -cat project/data/test/*.json > data/test.json")

#---------------------------------------------------------------------#

lr = LinearRegression(featuresCol="scaledFeatures", labelCol="aqi")

parameters = {
    'regParam': [0.01, 0.1],
    'elasticNetParam': [0.0, 0.5]
}

paramGrid = (ParamGridBuilder()
             .addGrid(lr.regParam, parameters['regParam'])
             .addGrid(lr.elasticNetParam, parameters['elasticNetParam'])
             .build())

crossval = CrossValidator(estimator=lr,
                          estimatorParamMaps=paramGrid,
                          evaluator=RegressionEvaluator(labelCol="aqi", predictionCol="prediction", metricName="rmse"),
                          numFolds=3)

cvModel = crossval.fit(train_data)
bestModel = cvModel.bestModel
bestRegParam = bestModel._java_obj.getRegParam()
bestElasticNetParam = bestModel._java_obj.getElasticNetParam()

bestModel.write().overwrite().save("project/models/model1")
run("hdfs dfs -get project/models/model1 models/model1")


p = bestModel.transform(test_data)

evaluator = RegressionEvaluator(labelCol="aqi", predictionCol="prediction", metricName="rmse")
rmse_1 = evaluator.evaluate(p)

evaluator = RegressionEvaluator(labelCol="aqi", predictionCol="prediction", metricName="r2")
r2_1 = evaluator.evaluate(p)

p = p.drop("scaledFeatures")


# Save the DataFrame to CSV
p.write \
    .mode("overwrite") \
    .format("csv") \
    .option("sep", ",") \
    .option("header", "true") \
    .save("project/output/model1_predictions")

# Optionally, concatenate the CSV files into a single file
run("hdfs dfs -cat project/output/model1_predictions/*.csv > output/model1_predictions.csv")

#---------------------------------------------------------------------#

gbt = GBTRegressor(featuresCol="scaledFeatures", labelCol="aqi")

parameters = {
    'maxDepth': [3, 10],
    'maxIter': [3, 10]
}

paramGrid = (ParamGridBuilder()
             .addGrid(gbt.maxDepth, parameters['maxDepth'])
             .addGrid(gbt.maxIter, parameters['maxIter'])
             .build())

crossval = CrossValidator(estimator=gbt,
                          estimatorParamMaps=paramGrid,
                          evaluator=RegressionEvaluator(labelCol="aqi", predictionCol="prediction", metricName="rmse"),
                          numFolds=3)

cvModel = crossval.fit(train_data)
bestModel2 = cvModel.bestModel

bestMaxDepth = bestModel2._java_obj.getMaxDepth()
bestMaxIter = bestModel2._java_obj.getMaxIter()
bestStepSize = bestModel2._java_obj.getStepSize()

bestModel2.write().overwrite().save("project/models/model2")
run("hdfs dfs -get project/models/model2 models/model2")


p = bestModel2.transform(test_data)

evaluator = RegressionEvaluator(labelCol="aqi", predictionCol="prediction", metricName="rmse")
rmse_2 = evaluator.evaluate(p)

evaluator = RegressionEvaluator(labelCol="aqi", predictionCol="prediction", metricName="r2")
r2_2 = evaluator.evaluate(p)

p = p.drop("scaledFeatures")


p.write \
    .mode("overwrite") \
    .format("csv") \
    .option("sep", ",") \
    .option("header", "true") \
    .save("project/output/model2_predictions")

# Optionally, concatenate the CSV files into a single file
run("hdfs dfs -cat project/output/model2_predictions/*.csv > output/model2_predictions.csv")

#---------------------------------------------------------------------#

models = [[str(bestModel),rmse_1, r2_1], [str(bestModel2),rmse_2, r2_2]]

df = spark.createDataFrame(models, ["model", "RMSE", "R2"])
df.show(truncate=False)

df.coalesce(1)\
    .write\
    .mode("overwrite")\
    .format("csv")\
    .option("sep", ",")\
    .option("header","true")\
    .save("project/output/evaluation.csv")

# Run it from root directory of the repository
run("hdfs dfs -cat project/output/evaluation.csv/*.csv > output/evaluation.csv")


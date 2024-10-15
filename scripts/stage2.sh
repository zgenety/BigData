hdfs dfs -mkdir -p project/warehouse/avsc
hdfs dfs -put output/*.avsc project/warehouse/avsc
password=$(head -n 1 secrets/.hive.pass)
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team39 -p $password -f sql/db.hql
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team39 -p $password -f sql/part.hql
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team39 -p $password -f sql/buck.hql
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team39 -p $password -f sql/drop.hql

beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team39 -p $password -f sql/q1.hql 
echo "sid,longitude,latitude" > output/q1.csv 
hdfs dfs -cat project/output/q1/* >> output/q1.csv 
 
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team39 -p $password -f sql/q2.hql 
echo "hours,aqi" > output/q2.csv 
hdfs dfs -cat project/output/q2/* >> output/q2.csv 
 
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team39 -p $password -f sql/q3.hql 
echo "months,aqi" > output/q3.csv 
hdfs dfs -cat project/output/q3/* >> output/q3.csv 
 
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team39 -p $password -f sql/q4.hql 
echo "sid,aqi" > output/q4.csv 
hdfs dfs -cat project/output/q4/* >> output/q4.csv 
 
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team39 -p $password -f sql/q5.hql 
echo "longitude,latitude,aqi" > output/q5.csv 
hdfs dfs -cat project/output/q5/* >> output/q5.csv

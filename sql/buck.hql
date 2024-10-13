USE team39_projectdb;
SET hive.exec.dynamic.partition=true;
SET hive.exec.dynamic.partition.mode=nonstrict;
SET hive.exec.max.dynamic.partitions=1000;
SET hive.exec.max.dynamic.partitions.pernode=1000;
CREATE EXTERNAL TABLE IF NOT EXISTS metrics_buck(
        date_time TIMESTAMP,
    aqi DECIMAL(5, 1),
    so2 DECIMAL(5, 1),
    co DECIMAL(5, 2),
    o3 DECIMAL(5, 1),
    o3_8hr DECIMAL(5, 1),
    pm10 DECIMAL(5, 1),
    pm2_5 DECIMAL(5, 1),
    no2 DECIMAL(5, 1),
    nox DECIMAL(5, 1),
    no DECIMAL(5, 1),
    windspeed DECIMAL(5, 1),
    winddirec DECIMAL(5, 1),
    co_8hr DECIMAL(5, 1),
    pm2_5_avg DECIMAL(5, 1),
    pm10_avg DECIMAL(5, 1),
    so2_avg DECIMAL(5, 1),
    id INT,
    sid INT
)
CLUSTERED BY (sid) into 8 buckets
STORED AS AVRO LOCATION 'project/hive/warehouse/metrics_buck' 
TBLPROPERTIES ('AVRO.COMPRESS'='SNAPPY');

INSERT INTO metrics_buck SELECT
date_time, aqi, so2, co, o3, o3_8hr, pm10, pm2_5, no2, nox, no, windspeed, winddirec, co_8hr, pm2_5_avg, pm10_avg, so2_avg, id, sid
FROM metrics;


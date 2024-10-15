DROP DATABASE IF EXISTS team39_projectdb CASCADE;
CREATE DATABASE team39_projectdb LOCATION "project/hive/warehouse";
USE team39_projectdb;
CREATE EXTERNAL TABLE stations STORED AS AVRO LOCATION 'project/warehouse/stations' TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/stations.avsc');
CREATE EXTERNAL TABLE metrics STORED AS AVRO LOCATION 'project/warehouse/metrics' TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/metrics.avsc');
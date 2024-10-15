USE team39_projectdb;

-- Drop the table if it exists
DROP TABLE IF EXISTS q1_results;

-- Create the external table
CREATE EXTERNAL TABLE q1_results (
    sid INT,
    longitude DECIMAL(10, 6),
    latitude DECIMAL(10, 6)
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION 'project/hive/warehouse/q1';

-- Insert data into the external table
INSERT OVERWRITE TABLE q1_results
SELECT 
    sid,
    longitude,
    latitude
FROM
    stations;

-- Export the results to a directory in CSV format
INSERT OVERWRITE DIRECTORY 'project/output/q1'
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
SELECT * FROM q1_results;
USE team39_projectdb;

-- Drop the table if it exists
DROP TABLE IF EXISTS q4_results;

-- Create the external table
CREATE EXTERNAL TABLE q4_results (
    sid INT,
    aqi DECIMAL(5, 1)
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION 'project/hive/warehouse/q4';

-- Insert data into the external table
INSERT OVERWRITE TABLE q4_results
SELECT 
    sid,
    AVG(aqi) AS avg_aqi
FROM
    metrics_part
GROUP BY
    sid
ORDER BY
    sid;

-- Export the results to a directory in CSV format
INSERT OVERWRITE DIRECTORY 'project/output/q4'
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
SELECT * FROM q4_results;
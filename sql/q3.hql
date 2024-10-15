USE team39_projectdb;

-- Drop the table if it exists
DROP TABLE IF EXISTS q3_results;

-- Create the external table
CREATE EXTERNAL TABLE q3_results (
    months INT,
    aqi DECIMAL(5, 1)
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION 'project/hive/warehouse/q3';

-- Insert data into the external table
INSERT OVERWRITE TABLE q3_results
SELECT 
    month(date_time) AS months,
    AVG(aqi) AS avg_aqi
FROM
    metrics_part
GROUP BY
    month(date_time)
ORDER BY
    months;

-- Export the results to a directory in CSV format
INSERT OVERWRITE DIRECTORY 'project/output/q3'
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
SELECT * FROM q3_results;
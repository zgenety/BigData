USE team39_projectdb;

-- Drop the table if it exists
DROP TABLE IF EXISTS q2_results;

-- Create the external table
CREATE EXTERNAL TABLE q2_results (
    hours INT,
    aqi DECIMAL(5, 1)
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION 'project/hive/warehouse/q2';

-- Insert data into the external table
INSERT OVERWRITE TABLE q2_results
SELECT 
    HOUR(date_time) AS hours,
    AVG(aqi) AS avg_aqi
FROM
    metrics_part
GROUP BY
    HOUR(date_time)
ORDER BY
    hours;

-- Export the results to a directory in CSV format
INSERT OVERWRITE DIRECTORY 'project/output/q2'
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
SELECT * FROM q2_results;
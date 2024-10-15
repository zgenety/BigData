USE team39_projectdb;

-- Drop the table if it exists
DROP TABLE IF EXISTS q5_results;

-- Create the external table
CREATE EXTERNAL TABLE q5_results (
    longitude DECIMAL(10, 6),
    latitude DECIMAL(10, 6),
    aqi DECIMAL(5, 1)
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION 'project/hive/warehouse/q5';

-- Insert data into the external table
INSERT OVERWRITE TABLE q5_results
SELECT 
    s.longitude,
    s.latitude,
    AVG(m.aqi) AS avg_aqi
FROM
    metrics_part m
JOIN 
    stations s ON m.sid = s.sid
GROUP BY
    m.sid, s.longitude, s.latitude
ORDER BY
    m.sid;

-- Export the results to a directory in CSV format
INSERT OVERWRITE DIRECTORY 'project/output/q5'
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
SELECT * FROM q5_results;
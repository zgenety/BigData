CREATE TABLE IF NOT EXISTS stations (
    sitename VARCHAR(255) NOT NULL,
    county VARCHAR(255) NOT NULL,
    longitude DECIMAL(10, 6),
    latitude DECIMAL(10, 6),
    sid INT,
    PRIMARY KEY (sid)
);

CREATE TABLE IF NOT EXISTS metrics (
    date_time TIMESTAMP NOT NULL,
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
    sid INT,
    id SERIAL,
    PRIMARY KEY (id),
    FOREIGN KEY (sid) REFERENCES stations(sid)
);


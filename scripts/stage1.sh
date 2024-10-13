url="https://disk.yandex.ru/d/mZR8rTueLfckLA"

wget "$(yadisk-direct $url)" -O data/data.zip

unzip data/data.zip -d data/
cp data/BD/*.csv data/
rm -rf data/BD
rm data/data.zip
python3 scripts/build_projectdb.py

password=$(head -n 1 secrets/.psql.pass)
hdfs dfs -rm -r project/*
cd output/
sqoop import-all-tables --connect jdbc:postgresql://hadoop-04.uni.innopolis.ru/team39_projectdb --username team39 --password $password --compression-codec=snappy --compress --as-avrodatafile --warehouse-dir=project/warehouse --m 1
cd ..

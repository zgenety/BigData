hdfs dfs -mkdir -p project/warehouse/avsc
hdfs dfs -put output/*.avsc project/warehouse/avsc
password=$(head -n 1 secrets/.hive.pass)
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team39 -p $password -f sql/db.hql > output/hive_results.txt
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team39 -p $password -f sql/part.hql > output/hive_results.txt
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team39 -p $password -f sql/buck.hql > output/hive_results.txt

Springboot Sharding-JDBC Mybatis-plus 分库分表 demo

# Get Start
1. init sql 导入doc/sql/demo.sql
2. start project

# 整合问题：
1. sharding-jdbc 不支持jdk1.8新增的数据类型，比如Localdate之类，新版本会解决此问题，低版本需要引入mybatis-jsr310
报错`java.sql.SQLFeatureNotSupportedException: getObject with type`
````xml
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis-typehandlers-jsr310</artifactId>
            <version>1.0.1</version>
        </dependency>
````
2. 主键id使用ShardingJDBC自动生成策略且作为分片键时报错`Sharding value must implements Comparable.`
解决方法
- 使用其他字段作为分片键
- 新增时不传入需要自动生成策略的字段（会与Mybatis-Plus冲突）

# Reference: 
1. Sharding JDBC:  https://shardingsphere.apache.org/document/5.1.2/cn/overview/
2. Knife4j: https://doc.xiaominfo.com/
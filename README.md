# 学习spring/springboot的测试demo，并没有什么技术含量的东西存在
***
## dubbo-zookeeper
### 该项目用于测试dubbo package，一个简单的服务提供者和一个消费者，结合zookeeper，测试灾备功能
***
## hibernate-demo
### 该项目用于测试hibernate
### 踩坑
    org.hibernate.hql.internal.ast.QuerySyntaxException: User is not mapped [from <model_name>],网上搜了半天，99.99的都在说是因为hql中表名要写Entity类的名字，而非数据库中的名字，最后发现是因为项目是聚合项目，需要将Entity类加入springboot扫描范围才行。具体做法是在启动类中添加下面代码
    `@EntityScan(basePackages = "com.heping.Entity")`
        

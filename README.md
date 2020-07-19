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
***

## ioctest
### 该项目用于学习IOC机制，共有五个项目
#### one
##### 该项目用于测试AnnotationConfigApplicationContext容器类，通过一个用@Configuration标注的类传递给该容器，进而实现类的注入，但是该项目中需要手动创建类实例然后注入，显然不合理
#### two
##### 该项目用于测试@Component注解，通过该注解实现类的注入，这样可以不用手动实例化这样SB的操作了，另外也测试了注入过滤功能excludeFilters，可以将指定类型的注解排除，如将用@Service标注的类排除
#### three
##### 该项目测试了lazyInit功能
#### four
##### 该项目测试了Bean的生命周期，扫描->销毁的全过程
#### five
##### 该项目用于测试SpringBoot读取配置文件的方式，可以用@Profile进行标注，指示SpringBoot如何进行读取配置文件，也可以通过@PropertySource方式手动引入配置文件，这样也会扫描；其次是测试通过xml文件配置bean，然后通过@ImportResource将配置文件引入，这样定义的类也可以被注入
***
## springboot-properties
spring boot读取配置文件的demo，是从别人的仓库中移过来的，为什么要移过来，项目中的readme中有说明
## webservice-helloworld-2.1.3
使用spring boot 2.1.3和cxf搭建的webservice
## springboot-restful
RESTful demo，也是从别人仓库中移过来的，原地址和原因项目中的readme中都有说明，项目中涉及到的技术还有mybatis，看了下，和Hibernate差不多，比Hibernate简单些看起来。

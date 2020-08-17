package com.heping.one;

import com.heping.dao.UserDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@SpringBootApplication(scanBasePackages = {"com.heping"})
//这里直接使用注解，指定扫描范围，且指定扫描用Repository标注的类，这个必须要加，否则不会自动扫描
//默认使用sqlSessionFactory，可以不指定
//@MapperScan(basePackages = "com.heping", annotationClass = Repository.class)
// 也可以使用Mapper注解表明这是需要扫描的类，但是使用该注解，basePackages必须详细到具体的package，不能指定父package或父package.*替代
@MapperScan(basePackages = {"com.heping.dao"})
public class OneApplication {

    //springboot自动生成
    @Autowired
    SqlSessionFactory sqlSessionFactory = null;

//    @Bean
//    public MapperFactoryBean<UserDao> initUserDao() {
//        //MapperFactoryBean能根据提供的接口创建代理类，这里只是提供接口类型
//        //在具体执行SQL操作时，是使用生成的代理类来实现的，而不是接口类
//        //但这样一个个配置，显然有点智障了
//        MapperFactoryBean<UserDao> bean = new MapperFactoryBean<>();
//        bean.setMapperInterface(UserDao.class);
//        bean.setSqlSessionFactory(sqlSessionFactory);
//        return bean;
//    }

//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer(){
//        //这里使用配置类，不用再一个个接口分别配置，省事~
//        //但是显然不符合springboot的理念，还是要写代码配置
//        MapperScannerConfigurer configurer=new MapperScannerConfigurer();
//        configurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
//        configurer.setBasePackage("com.heping.dao");
//        configurer.setAnnotationClass(Repository.class);
//        return configurer;
//    }

    public static void main(String[] args) {
        SpringApplication.run(OneApplication.class, args);
    }

}

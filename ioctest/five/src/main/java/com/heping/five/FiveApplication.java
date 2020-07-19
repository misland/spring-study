package com.heping.five;

import com.heping.config.AppConfig;
import com.heping.definition.Animal;
import com.heping.pojo.Dog;
import com.heping.pojo.User;
import com.heping.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@SpringBootApplication
@ComponentScan(basePackages = "com.heping")
//指定资源配置文件，可在项目中使用
@PropertySource(value = {"classpath:test.properties"}, ignoreResourceNotFound = true)
//引入bean的xml配置文件，spring会扫描该文件定义的bean，进而加载到IOC容器中
@ImportResource(value = {"classpath:bean.xml"})
public class FiveApplication implements CommandLineRunner {

    @Autowired
    private User user;

    @Autowired
    private Dog dog;

    @Autowired
    private Book book;

    //这里可以和用标注方式定义的类一样，使用Autowired注入
    @Autowired
    private Animal squirrel;

    public static void main(String[] args) {
        SpringApplication.run(FiveApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(String.format("hello %s, age:%s, sex:%s, note:%s", user.getName(), user.getAge(), user.getSex(), user.getNote()));
        System.out.println(String.format("hell %s,type:%s", dog.getName(), dog.getType()));
        System.out.println(String.format("book name:%s, description:%s, price: %s", book.getName(), book.getDescription(), book.getPrice()));
        squirrel.doSomething();
    }
}

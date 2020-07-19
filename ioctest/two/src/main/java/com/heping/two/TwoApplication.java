package com.heping.two;

import com.heping.config.AppConfig;
import com.heping.pojo.Customer;
import com.heping.pojo.User;
import com.heping.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TwoApplication {

    public static void main(String[] args) {
        //通过配置AppConfig，添加@ComponentScan注解，定义扫描范围，自动将需要的对象注入到IOC容器中
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        User tem = ctx.getBean(User.class);
        System.out.println(tem.getName());


        //因为在AppConfig中将Service标注排除，所以这里无法获取UserService实例，下面代码会抛出错误
//        UserService userService=ctx.getBean(UserService.class);
//        userService.printUser(tem);
    }

}

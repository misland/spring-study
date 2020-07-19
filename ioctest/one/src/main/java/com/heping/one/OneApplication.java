package com.heping.one;

import com.heping.config.AppConfig;
import com.heping.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OneApplication {

    public static void main(String[] args) {
        //AnnotationConfigApplicationContext是一个基于注解的IOC容器，springboot装配和获取bean的方法与其一致
        //这里实例化了一个IOC容器，把配置类（AppConfig类添加了@Configuration注解）传递给该容器，这样AppConfig中创建的对象就可以加载到IOC容器中
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        //这里通过类型直接获取对象，因为加载到IOC容器时会记录其类型，所以这里可以直接获取到
        User tem=ctx.getBean(User.class);
        System.out.println(tem.getName());

        //这里通过bean的name获取，但是这样并不知道获取到的对象类型，所以要转换
        User tem2=(User)ctx.getBean("user");
        System.out.println(tem2.getNote());

        //这里是手动将类实例化，然后注入到IOC容器中，如果有多个类，这样做明显不合理
    }

}

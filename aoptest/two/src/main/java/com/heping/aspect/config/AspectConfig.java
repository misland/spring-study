package com.heping.aspect.config;

import com.heping.aspect.MyAspect;
import com.heping.aspect.MyAspect2;
import com.heping.aspect.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
//启动@AspectJ切面编程  
@EnableAspectJAutoProxy
//定义扫描包  
@ComponentScan(basePackages = {"com.heping.aspect.*"}, basePackageClasses = UserServiceImpl.class)
public class AspectConfig {

    @Bean(name = "myAspect")
    public MyAspect initMyAspect() {
        return new MyAspect();
    }

    @Bean(name = "myAspect2")
    public MyAspect2 initMyAspect2() {
        return new MyAspect2();
    }
}

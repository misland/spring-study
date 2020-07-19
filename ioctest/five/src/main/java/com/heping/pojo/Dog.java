package com.heping.pojo;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//默认的profile是default，如果设置了，且不是default，如果在程序启动时没有设置profile，则不会将该类加入IOC容器中
//设置方法 VM options=-Dspring.profiles.active=dev
//设置后，会自动读取application-dev.properties文件中的配置
@Profile("dev")
//也可以使用该注解，自动将配置加载到属性上，必须设置setter方法
@ConfigurationProperties(prefix = "dog")
public class Dog {
    private String Type;
    private String Name;

    public void setType(String type) {
        Type = type;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public String getName() {
        return Name;
    }
}

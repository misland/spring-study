package com.heping.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//该注解表示这个类需要被扫描并注入到IOC容器中，名字为testUser，如果不配置这个属性，默认为user，即类名第一个字母小写
@Component("testUser")
public class User {
    @Value("1")
    private Integer Id;
    @Value("Loki")
    private String Name;
    @Value("M")
    private String Sex;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }
}

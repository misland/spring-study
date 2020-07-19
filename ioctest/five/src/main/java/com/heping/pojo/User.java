package com.heping.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class User {
    //这是是个坑
    //Spring Boot 的默认 StandardEnvironment 首先将会加载 “systemEnvironment” 作为首个PropertySource.
    //而 source 即为System.getProperties().当 getProperty时,按照读取顺序,返回 “systemEnvironment” 的值.即 System.getProperty(“user.name“)
    //拿到值后，后面的就不管了，所以这里即使设置了也没用，依然会读取当前用户名- -
    @Value("loki")
    private String Name;
    //可以使用占位符的方式将配置加载到属性上
    //这种就不必非要设置setter函数
    @Value("${user.Age}")
    private String Age;
    @Value("${user.Sex}")
    private String Sex;
    @Value("${user.Note}")
    private String Note;

//    public void setName(String name) {
//        Name = name;
//    }
//
//    public void setAge(String age) {
//        Age = age;
//    }
//
//    public void setSex(String sex) {
//        Sex = sex;
//    }
//
//    public void setNote(String note) {
//        Note = note;
//    }

    public String getName() {
        return Name;
    }

    public String getAge() {
        return Age;
    }

    public String getSex() {
        return Sex;
    }

    public String getNote() {
        return Note;
    }
}

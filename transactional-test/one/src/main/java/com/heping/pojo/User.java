package com.heping.pojo;

import com.heping.enumerator.SexEnum;
import org.apache.ibatis.type.Alias;


@Alias(value = "user")
public class User {
    private String name;
    private Integer id;
    private Integer age;
    //属性名需要和数据库操持一致，否则插入转换时会出问题
    private SexEnum sex;

    public SexEnum getSexEnum() {
        return sex;
    }

    public void setSexEnum(SexEnum sexEnum) {
        this.sex = sexEnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

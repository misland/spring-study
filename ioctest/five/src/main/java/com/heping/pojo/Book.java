package com.heping.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    //用的是test.properties配置文件中的配置
    @Value("${book.name}")
    private String Name;
    @Value("${book.description}")
    private String Description;
    @Value("${book.price}")
    private String Price;

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public String getPrice() {
        return Price;
    }
}

package com.heping.service;

import com.heping.definition.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println(String.format("hello %s", name));
    }
}

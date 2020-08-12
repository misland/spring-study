package com.heping.aspect.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public void sayHello(String name) {
        System.out.println(String.format("hello %s", name));
    }
}

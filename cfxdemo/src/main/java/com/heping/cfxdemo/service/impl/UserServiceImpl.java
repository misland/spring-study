package com.heping.cfxdemo.service.impl;

import com.heping.cfxdemo.service.UserService;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

@WebService(serviceName = "UserService",
        targetNamespace = "http://service.cfxdemo.heping.com/",
        endpointInterface = "com.heping.cfxdemo.service.UserService")
@Component
public class UserServiceImpl implements UserService {
    @Override
    public String helloworld() {
        return "hello world";
    }
}

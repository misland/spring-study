package com.heping.cxfdemo.service.impl;

import com.heping.cxfdemo.service.UserService;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;

@Component
@WebService(serviceName = "UserService",
        endpointInterface = "com.heping.cxfdemo.service.UserService")
public class UserServiceImpl implements UserService {
    //methods will be published as services even if @WebMethod doesn't not added
    @WebMethod
    @Override
    public String sayHello() {
        return "hello world";
    }

    //this method won't be published when exclude is set
    @WebMethod(exclude = true)
    @Override
    public String work() {
        return "doggie,go to work";
    }
}

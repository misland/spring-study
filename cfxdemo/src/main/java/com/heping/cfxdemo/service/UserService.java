package com.heping.cfxdemo.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://service.cfxdemo.heping.com/")
public interface UserService {
    @WebMethod
    String helloworld();
}

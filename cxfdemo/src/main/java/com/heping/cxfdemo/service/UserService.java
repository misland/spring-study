package com.heping.cxfdemo.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface UserService {
    String sayHello();

    String work();
}

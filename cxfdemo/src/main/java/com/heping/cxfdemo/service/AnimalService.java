package com.heping.cxfdemo.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface AnimalService {
    @WebMethod
    String work();
}

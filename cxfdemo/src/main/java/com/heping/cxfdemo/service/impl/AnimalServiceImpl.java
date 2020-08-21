package com.heping.cxfdemo.service.impl;

import com.heping.cxfdemo.service.AnimalService;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

@Component
@WebService(serviceName = "AnimalService", endpointInterface = "com.heping.cxfdemo.service.AnimalService")
public class AnimalServiceImpl implements AnimalService {
    @Override
    public String work() {
        return "work for master";
    }
}

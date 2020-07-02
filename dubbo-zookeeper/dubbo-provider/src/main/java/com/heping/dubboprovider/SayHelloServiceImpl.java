package com.heping.dubboprovider;

import com.heping.SayHelloService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class SayHelloServiceImpl implements SayHelloService {
    @Override
    public String sayHello(String name) {
        return "hi," + name;
    }
}

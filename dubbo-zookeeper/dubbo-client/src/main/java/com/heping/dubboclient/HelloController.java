package com.heping.dubboclient;

import com.heping.SayHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Reference
    private SayHelloService sayHelloService;

    @GetMapping("/hello")
    public String sayHello(@RequestParam("name") String name) {
        return sayHelloService.sayHello(name);
    }
}

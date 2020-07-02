package com.heping.dubboclient;

import com.heping.SayHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Reference
    private SayHelloService sayHelloService;

    @GetMapping("/hello")
    public String sayHello(@RequestParam("name") String name) {
        System.out.println("receive request");
        return sayHelloService.sayHello(name);
    }
}

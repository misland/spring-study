package com.heping.cfxdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.heping.cfxdemo"})
public class CfxdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CfxdemoApplication.class, args);
    }

}

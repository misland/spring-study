package com.heping.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;


//basePackages很重要，如果不加该属性，默认会扫描AppConfig所在目录及子目录下的文件，其它目录下是不会扫描的
//将basePackages定义为com.heping，那该目录下所有的文件均会被扫描，所以User可以正常注入
//使用excludeFilters后，用@Servic标注的类将不再被扫描
@ComponentScan(basePackages = "com.heping",
        excludeFilters = {@ComponentScan.Filter(classes = {Service.class})})
public class AppConfig {
}

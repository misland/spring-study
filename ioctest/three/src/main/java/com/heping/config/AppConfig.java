package com.heping.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//ComponentScan应放在配置类中，放在启动类中并不起作用
@Configuration
//lazyInit表示是否延迟注入，默认为false，也就是说当IOC容器初始化时会将所有依赖对象注入
//而设置为true时，只有在对象用到依赖的对象时，才会将被依赖对象注入，与Hibernate延迟加载类似
@ComponentScan(basePackages = "com.heping", lazyInit = true)
public class AppConfig {
}

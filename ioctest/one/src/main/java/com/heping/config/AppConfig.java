package com.heping.config;

import com.heping.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "user")
    public User getUser() {
        User tem = new User();
        tem.setName("Loki");
        tem.setSex("M");
        tem.setNote(("A man who loves his daughter more than anything"));
        return tem;
    }
}

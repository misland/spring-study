package com.heping.service;

import com.heping.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void printUser(User user) {
        System.out.println(user.getName());
    }
}

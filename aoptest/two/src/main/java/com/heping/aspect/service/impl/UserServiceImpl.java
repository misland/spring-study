package com.heping.aspect.service.impl;

import com.heping.aspect.service.UserService;
import com.heping.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void printUser(User user) {
        if (user == null) {
            throw new RuntimeException("user is null");
        }
        System.out.println(String.format("username:%s,note:%s", user.getUsername(), user.getNote()));
    }
}

package com.heping.service;

import com.heping.definition.UserService;
import com.heping.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void printUser(User user) {
        if (user == null) {
            throw new RuntimeException("user is null");
        }
        System.out.println(user.getName());
        System.out.println(user.getNote());
    }
}

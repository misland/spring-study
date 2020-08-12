package com.heping.service;

import com.heping.definition.UserValidator;
import com.heping.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserValidatorImpl implements UserValidator {
    @Override
    public boolean validate(User user) {
        System.out.println("check if user is null");
        return user == null;
    }
}

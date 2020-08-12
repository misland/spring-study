package com.heping.aspect.validator.impl;


import com.heping.aspect.validator.UserValidator;
import com.heping.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserValidatorImpl implements UserValidator {

	@Override
	public boolean validate(User user) {
		System.out.println("引入新的接口："+ UserValidator.class.getSimpleName());
		return user != null;
	}

}

package com.heping.service;

import com.heping.pojo.User;

public interface UserService {
    User getUser(Integer id);

    void addUser(User user);
}

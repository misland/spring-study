package com.heping.service.impl;

import com.heping.dao.UserDao;
import com.heping.pojo.User;
import com.heping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao = null;

    @Override
    public User getUser(Integer id) {
        return userDao.getUser(id);
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,timeout = 1)
    public void addUser(User user) {
        userDao.addUser(user);
    }
}

package com.heping.controller;


import com.alibaba.fastjson.JSON;
import com.heping.DAO.UserDao;
import com.heping.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/all")
    public @ResponseBody
    String getAll() {
        return JSON.toJSONString(userDao.findAll());
    }
}

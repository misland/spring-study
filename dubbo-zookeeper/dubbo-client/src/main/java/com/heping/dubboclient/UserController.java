package com.heping.dubboclient;

import com.alibaba.fastjson.JSON;
import com.heping.Model.User;
import com.heping.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Reference
    private UserService userService;

    @RequestMapping("/all")
    public String queryAll(){
        List<User> result=userService.getAll();
        return JSON.toJSON(result).toString();
    }
}

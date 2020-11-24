package com.heping.controller;

import com.heping.enumerator.SexEnum;
import com.heping.pojo.User;
import com.heping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService = null;

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(Integer id) {
        return userService.getUser(id);
    }

    @PostMapping("/addUser")
    @ResponseBody
    public User addUser(@RequestParam("name") String name, @RequestParam("age") int age, @RequestParam("sex") int sex) {
        System.out.println(String.format("name=%s,age=%d,sex=%d", name, age, sex));
        User tem = new User();
        tem.setName(name);
        tem.setAge(age);
        SexEnum sexEnum = sex == 1 ? SexEnum.MALE : SexEnum.FEMALE;
        tem.setSexEnum(sexEnum);
        userService.addUser(tem);
        return tem;
    }
}

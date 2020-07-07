package com.heping;

import com.heping.Model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    int updateById(int id);
}

package com.heping.dao;

import com.heping.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//@Repository
@Mapper
public interface UserDao {
    //在配置文件userMapper.xml中定义了getUser和对应的SQL，所以这里可以定义同名方法
    // 后面MapperFactoryBean在创建代理类时就能根据配置文件知道getUser该如何操作
    User getUser(Integer id);

    void addUser(User user);
}

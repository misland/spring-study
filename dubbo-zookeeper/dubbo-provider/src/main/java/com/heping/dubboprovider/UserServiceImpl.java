package com.heping.dubboprovider;

import com.heping.Model.User;
import com.heping.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getAll() {
        List<Map<String,Object>> queryResult=jdbcTemplate.queryForList("select * from lb_user");
        List<User> result=new ArrayList<>();
        for(Map<String,Object> item : queryResult){
            User tem=new User();
            tem.setAccount(item.get("account_name").toString());
            tem.setPassword(item.get("password").toString());
            tem.setName(item.get("name").toString());
            tem.setSex(item.get("sex").toString());
            tem.setAge(Integer.parseInt(item.get("age").toString()));
            result.add(tem);
        }
        return result;
    }

    @Override
    public User updateById(int id) {
        return null;
    }
}

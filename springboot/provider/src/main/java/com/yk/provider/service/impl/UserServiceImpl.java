package com.yk.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yk.provider.common.domin.User;
import com.yk.provider.mapper.UserMapper;
import com.yk.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String getUser() {
        return "你好，DUBBO";
    }
    @Override
    public List<User> getAll() {
//        User user = new User();
//        user.setAge(12);
//        user.setId(1);
//        user.setName("zhangsan");
//        user.setSex("nan");
//        return user;
        System.out.println("OK!@#!#");
        List<User> user = userMapper.getAll();
        return userMapper.getAll();
//        return userMapper.getOne(1l);
    }
}

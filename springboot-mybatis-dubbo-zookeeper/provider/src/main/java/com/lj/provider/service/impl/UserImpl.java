package com.lj.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lj.common.domin.User;
import com.lj.provider.mapper.UserMapper;
import com.lj.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Service
public class UserImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
//        User user = new User();
//        user.setAge(12);
//        user.setId(1);
//        user.setName("zhangsan");
//        user.setSex("nan");
//        return user;
        System.out.println("OK!@#!#");
        return userMapper.getAll();
//        return userMapper.getOne(1l);
    }
}

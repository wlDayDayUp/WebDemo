package com.lj.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lj.common.domin.User;
import com.lj.common.service.UserService;
import com.lj.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;


@Service(version = "1.0.0")
public class UserImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUser() {
//        User user = new User();
//        user.setAge(12);
//        user.setId(1);
//        user.setName("zhangsan");
//        user.setSex("nan");
//        return user;
        return userMapper.getOne(1l);
//        return userMapper.getOne(1l);
    }
}
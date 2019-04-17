package com.lj.common.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lj.common.domin.User;

import java.util.List;
@Service
public interface UserService {
    List<User> getAll();
}

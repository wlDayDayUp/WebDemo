package com.lj.customer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lj.common.domin.User;
import com.lj.common.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: gaopeng
 * Date: 2018/8/28 0028
 * Time: 17:45
 * Description:
 */
@RestController
public class UserController {
    @Resource
    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("getUser")
    public User user(){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        System.out.println(userService.hashCode()+"!!!!!!!!!!!!!!!!");
        return userService.findUser();
    }
}

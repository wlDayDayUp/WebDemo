package com.lj.customer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lj.common.domin.User;
import com.lj.provider.service.RedisService;
import com.lj.provider.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
public class UserController {
    @Reference
    private UserService userService;
    @Reference
    private RedisService redisservice;

    @GetMapping("getUser")
    public ModelAndView user(ModelAndView mv){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        /*List<User> user1 = userService.getAll();
        redisservice.set("user",user1);*/
        List<User> user = (List<User>) redisservice.get("user");
        for(User user2:user){
            System.out.println("!@#@!@!!@####"+user2.getName());
        }

        mv.setViewName("listuser");
        mv.addObject("user",user);
        return mv;
    }
}

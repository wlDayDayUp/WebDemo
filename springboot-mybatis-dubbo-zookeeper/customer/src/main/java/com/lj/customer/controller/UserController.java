package com.lj.customer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lj.common.domin.User;
import com.lj.common.service.RedisService;
import com.lj.common.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class UserController {
    @Resource
    @Reference(version = "1.0.0")
    private UserService userService;
    @Resource
    private RedisService redisservice;

    @GetMapping("getUser")
    public ModelAndView user(ModelAndView mv){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        System.out.println(userService.hashCode()+"!!!!!!!!!!!!!!!!");
       // List<User> user = userService.findUser();
        //redisservice.set("user",user);
        List<User> user = (List<User>) redisservice.get("user");
        for(User user1:user){
            System.out.println("!@#@!@!!@####"+user1.getName());
        }

        mv.setViewName("listuser");
        mv.addObject("user",user);
        return mv;
    }
}

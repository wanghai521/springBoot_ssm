package com.hai.springboot_ssm.controller;

import com.hai.springboot_ssm.entity.User;
import com.hai.springboot_ssm.service.UserService;
import com.hai.springboot_ssm.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * uer控制层
 */
@RestController
@RequestMapping("/usercontrlller")
public class UserContrlller {

    @Autowired
    private UserService userService;

    @Autowired
    private RedisUtils redisUtils;


    @RequestMapping("/getuserbyid/{id}")
    public String getUserById(@PathVariable int id) {

        redisUtils.set("whainame", "wanghai");

        String whainame = (String)redisUtils.get("whainame");
        System.out.println(whainame);

        return userService.getUser(id).toString();
    }


    @RequestMapping("/findusrsbyrole/{role}")
    public List<User> findUsrsByRole(@PathVariable String role) {

        return userService.findUserByRole(role);
    }
}

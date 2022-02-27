package com.hai.springboot_ssm.controller;

import com.hai.springboot_ssm.entity.User;
import com.hai.springboot_ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * uer控制层
 */
@RestController
@RequestMapping("/uercntrlller")
public class UserContrlller {

    @Autowired
    private UserService userService;


    @RequestMapping("/getuserbyid/{id}")
    public String getUserById(@PathVariable int id){
        return  userService.getUser(id).toString();
    }


    @RequestMapping("/findusrsbyrole/{role}")
    public List<User> findUsrsByRole(@PathVariable String role){

        return userService.findUserByRole(role);
    }
}

package com.hai.springboot_ssm.service;

import com.hai.springboot_ssm.entity.User;
import com.hai.springboot_ssm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * userservice
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public List<User> findUserByRole(String role) {
        if (role == null || "".equals(role)) {
            return null;
        }

        return userMapper.findUserByRole(role);
    }


    public User getUser(int id) {
        return userMapper.getUser(id);
    }


}


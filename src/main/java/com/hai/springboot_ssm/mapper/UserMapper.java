package com.hai.springboot_ssm.mapper;

import com.hai.springboot_ssm.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * mapper层
 */
@Mapper
public interface UserMapper {

    public List<User> findUserByRole(String role);

    public  User getUser(int id);
}

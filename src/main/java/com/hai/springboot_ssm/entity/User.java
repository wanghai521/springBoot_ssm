package com.hai.springboot_ssm.entity;

import lombok.Data;

/**
 * uer实体
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String email;
    private String role;

}

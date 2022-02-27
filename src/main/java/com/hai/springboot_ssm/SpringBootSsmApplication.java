package com.hai.springboot_ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("com.hai.springboot_ssm.mapper")
@SpringBootApplication
public class SpringBootSsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSsmApplication.class, args);
    }

}

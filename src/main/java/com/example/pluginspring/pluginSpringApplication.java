package com.example.pluginspring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.pluginspring.mapper")
@SpringBootApplication
public class pluginSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(pluginSpringApplication.class, args);
    }
}

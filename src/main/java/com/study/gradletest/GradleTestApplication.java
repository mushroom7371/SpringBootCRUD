package com.study.gradletest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"com.study.dao"})
@SpringBootApplication
public class GradleTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradleTestApplication.class, args);
    }

}

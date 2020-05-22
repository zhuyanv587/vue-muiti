package com.example.muiti;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.muiti.mapper")
public class VueMuitiApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueMuitiApplication.class, args);
    }
}

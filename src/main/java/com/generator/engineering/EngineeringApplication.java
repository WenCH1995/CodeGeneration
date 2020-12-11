package com.generator.engineering;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.generator.engineering.dao.**.mapper")
public class EngineeringApplication {

    public static void main(String[] args) {
        SpringApplication.run(EngineeringApplication.class, args);
    }

}

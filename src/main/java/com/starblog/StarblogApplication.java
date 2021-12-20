package com.starblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class StarblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarblogApplication.class, args);
    }

}

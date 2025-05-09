package com.example.serverspringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.serverspringapp")
public class ServerSpringAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerSpringAppApplication.class, args);
    }

}

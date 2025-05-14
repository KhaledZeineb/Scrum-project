package com.example.scrum_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ScrumProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScrumProjectApplication.class, args);
    }

}

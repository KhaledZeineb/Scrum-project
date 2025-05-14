package com.example.scrum_project.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Book Management API")
                        .description("Spring Boot REST API for managing books")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Book Management Team")
                                .email("contact@bookmanagement.com")));
    }
}
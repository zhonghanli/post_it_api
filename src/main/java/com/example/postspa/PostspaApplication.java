package com.example.postspa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class PostspaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostspaApplication.class, args);
    }
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/posts").allowedOrigins("http://localhost:3000");
                registry.addMapping("/createpost").allowedOrigins("http://localhost:3000");
                registry.addMapping("/deletepost").allowedOrigins("http://localhost:3000");

            }
        };
    }

}


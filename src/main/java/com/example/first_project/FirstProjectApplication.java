package com.example.first_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
        System.out.println("It's me Gokul.....");

        Article article = context.getBean(Article.class);
        article.show();
    }
}

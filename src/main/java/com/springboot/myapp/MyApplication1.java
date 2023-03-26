package com.springboot.myapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyApplication1 {
    public static void main(String[] args) {
        SpringApplication.run(MyappApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(String[] args){
        return runner->{
            System.out.println("Hello!");
        };
    }
}

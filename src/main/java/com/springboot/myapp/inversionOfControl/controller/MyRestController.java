package com.springboot.myapp.inversionOfControl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @Value("${my.name}")
    private String name;

    @GetMapping("/")
    public String sayHello(){
        return "Hello!! " + name;
    }

}

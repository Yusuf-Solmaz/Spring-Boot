package com.springboot.myapp.inversionOfControl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewRestController {
    @GetMapping("/test")
    public String testing(){
        return "Test Successful.";
    }
}

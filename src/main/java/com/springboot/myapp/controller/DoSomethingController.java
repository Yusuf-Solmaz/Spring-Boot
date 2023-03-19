package com.springboot.myapp.controller;


import com.springboot.myapp.service.DoSomething;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoSomethingController {

    private DoSomething doSomething;

    @Autowired
    public DoSomethingController(@Qualifier("television") DoSomething doSomething) {
        System.out.println(getClass().getSimpleName());
        this.doSomething = doSomething;

    }

    @GetMapping("/useIt")
    public  String play(){
        return doSomething.useIt();
    }

}

package com.springboot.myapp.controller;


import com.springboot.myapp.service.DoSomething;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoSomethingController {

    private DoSomething television;
    private DoSomething computer;

    @Autowired
    public DoSomethingController(@Qualifier("television") DoSomething television,@Qualifier("computer") DoSomething computer) {
        System.out.println(getClass().getSimpleName());
        this.television = television;
        this.computer = computer;

    }

    @GetMapping("/watch")
    public  String watch(){
        return television.useIt();
    }

    @GetMapping("/play")
    public  String pla1(){
        return computer.useIt();
    }

}

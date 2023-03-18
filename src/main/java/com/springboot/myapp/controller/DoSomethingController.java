package com.springboot.myapp.controller;


import com.springboot.myapp.service.DoSomething;
import com.springboot.myapp.serviceImp.Play;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoSomethingController {

    private DoSomething doSomething;

    @Autowired
    public DoSomethingController(DoSomething doSomething) {
        this.doSomething = doSomething;

    }

    @GetMapping("/playComputer")
    public  String play(){
        return doSomething.playComputerGames();
    }

}

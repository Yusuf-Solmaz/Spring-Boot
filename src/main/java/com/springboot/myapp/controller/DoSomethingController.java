package com.springboot.myapp.controller;


import com.springboot.myapp.service.DoSomething;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoSomethingController {

    private DoSomething smartPhone;

    @Autowired
    public DoSomethingController(@Qualifier("smartPhone") DoSomething smartPhone) {
        System.out.println(getClass().getSimpleName());
        this.smartPhone=smartPhone;

    }

    @GetMapping("play")
    public String play(){
        return smartPhone.useIt();
    }


}

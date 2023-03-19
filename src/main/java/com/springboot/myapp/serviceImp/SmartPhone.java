package com.springboot.myapp.serviceImp;

import com.springboot.myapp.service.DoSomething;

public class SmartPhone implements DoSomething {
    @Override
    public String useIt() {
        return "Playing a mobile game!";
    }
}

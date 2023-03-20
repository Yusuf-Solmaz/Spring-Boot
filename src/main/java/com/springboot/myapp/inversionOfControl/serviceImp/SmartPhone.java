package com.springboot.myapp.inversionOfControl.serviceImp;

import com.springboot.myapp.inversionOfControl.service.DoSomething;

public class SmartPhone implements DoSomething {
    @Override
    public String useIt() {
        return "Playing a mobile game!";
    }
}

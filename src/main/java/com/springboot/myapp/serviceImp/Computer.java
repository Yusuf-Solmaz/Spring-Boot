package com.springboot.myapp.serviceImp;

import com.springboot.myapp.service.DoSomething;
import org.springframework.stereotype.Component;

@Component
public class Computer implements DoSomething {


    public Computer() {
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public String useIt() {
        return "Playing Computer Games!";
    }
}

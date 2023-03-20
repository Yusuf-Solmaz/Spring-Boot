package com.springboot.myapp.inversionOfControl.serviceImp;

import com.springboot.myapp.inversionOfControl.service.DoSomething;
import org.springframework.stereotype.Component;

@Component
// @Primary   (Another option for @Qualifier)
public class Television implements DoSomething {

    public Television() {
        //System.out.println(getClass().getSimpleName());
    }

    @Override
    public String useIt() {
        return "Watching TV!";
    }
}

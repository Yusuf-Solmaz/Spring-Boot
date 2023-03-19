package com.springboot.myapp.serviceImp;

import com.springboot.myapp.service.DoSomething;
import org.springframework.stereotype.Component;

@Component
public class Television implements DoSomething {

    @Override
    public String useIt() {
        return "Watching TV!";
    }
}

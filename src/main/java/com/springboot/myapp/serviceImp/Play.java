package com.springboot.myapp.serviceImp;

import com.springboot.myapp.service.DoSomething;
import org.springframework.stereotype.Component;

@Component
public class Play implements DoSomething {

    @Override
    public String playComputerGames() {
        return "Playing Computer Games!";
    }
}

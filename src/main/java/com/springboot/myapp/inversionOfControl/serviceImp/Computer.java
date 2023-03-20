package com.springboot.myapp.inversionOfControl.serviceImp;

import com.springboot.myapp.inversionOfControl.service.DoSomething;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // Default is "singleton"
public class Computer implements DoSomething {


    public Computer() {
        //System.out.println(getClass().getSimpleName());
    }

    /*
    @PostConstruct
    public void postConstructMethod(){
        System.out.println("Post Construct Worked for: "+ getClass().getSimpleName());
    }

    @PreDestroy
    public void preDestroyMethod(){
        System.out.println("Pre-Destroy Worked for: "+ getClass().getSimpleName());
    }
    */

    @Override
    public String useIt() {
        return "Playing Computer Games!";
    }
}

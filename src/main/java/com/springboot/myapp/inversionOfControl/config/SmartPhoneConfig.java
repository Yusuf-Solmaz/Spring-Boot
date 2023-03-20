package com.springboot.myapp.inversionOfControl.config;

import com.springboot.myapp.inversionOfControl.service.DoSomething;
import com.springboot.myapp.inversionOfControl.serviceImp.SmartPhone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SmartPhoneConfig {

    @Bean
    public DoSomething smartPhone(){
        return new SmartPhone();
    }
}

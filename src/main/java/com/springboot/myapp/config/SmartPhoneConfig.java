package com.springboot.myapp.config;

import com.springboot.myapp.service.DoSomething;
import com.springboot.myapp.serviceImp.SmartPhone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SmartPhoneConfig {

    @Bean
    public DoSomething smartPhone(){
        return new SmartPhone();
    }
}

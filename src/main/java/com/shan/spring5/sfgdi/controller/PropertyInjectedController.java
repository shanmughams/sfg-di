package com.shan.spring5.sfgdi.controller;

import com.shan.spring5.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyInjectedGreetingServiceImpl")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return  greetingService.sayGreeting();
    }
}

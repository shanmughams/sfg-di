package com.shan.spring5.sfgdi.controller;

import com.shan.spring5.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting() {
        return  greetingService.sayGreeting();
    }
}

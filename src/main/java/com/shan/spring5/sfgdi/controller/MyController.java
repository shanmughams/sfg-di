package com.shan.spring5.sfgdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello() {
        System.out.println("Hi Shan");
        return "Hi All";
    }
}

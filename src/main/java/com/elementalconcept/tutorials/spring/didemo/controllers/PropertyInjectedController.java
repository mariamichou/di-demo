package com.elementalconcept.tutorials.spring.didemo.controllers;

import com.elementalconcept.tutorials.spring.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    GreetingService greetingService;

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}

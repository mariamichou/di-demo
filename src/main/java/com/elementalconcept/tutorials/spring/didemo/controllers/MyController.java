package com.elementalconcept.tutorials.spring.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    static final String HELLO = "Hello! Welcome to Spring World!";

    public String sayHello() {
        return HELLO;
    }
}

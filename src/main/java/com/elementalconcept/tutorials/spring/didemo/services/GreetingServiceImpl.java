package com.elementalconcept.tutorials.spring.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    static final String HELLO = "Hello from GreetingService! Welcome to Spring World!";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}

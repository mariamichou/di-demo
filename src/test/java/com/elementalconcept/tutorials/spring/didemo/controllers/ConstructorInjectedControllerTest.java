package com.elementalconcept.tutorials.spring.didemo.controllers;

import com.elementalconcept.tutorials.spring.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorInjectedControllerTest {

    private static final String HELLO = "Hello from GreetingService! Welcome to Spring World!";

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void sayGreeting() {
        assertEquals(HELLO, constructorInjectedController.sayGreeting());
    }
}
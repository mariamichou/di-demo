package com.elementalconcept.tutorials.spring.didemo.controllers;

import com.elementalconcept.tutorials.spring.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private static final String HELLO = "Hello from GreetingService! Welcome to Spring World!";
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void sayGreeting() {
        assertEquals(HELLO, propertyInjectedController.sayGreeting());
    }
}
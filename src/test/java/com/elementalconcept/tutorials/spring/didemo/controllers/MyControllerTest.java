package com.elementalconcept.tutorials.spring.didemo.controllers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyControllerTest {

    private MyController myController;

    @Before
    public void setUp() {
        myController = new MyController();
    }

    @Test
    public void sayHello() {
        assertEquals(MyController.HELLO, myController.sayHello());
    }
}
package com.elementalconcept.tutorials.spring.didemo;

import com.elementalconcept.tutorials.spring.didemo.controllers.ConstructorInjectedController;
import com.elementalconcept.tutorials.spring.didemo.controllers.MyController;
import com.elementalconcept.tutorials.spring.didemo.controllers.PropertyInjectedController;
import com.elementalconcept.tutorials.spring.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        // get MyController bean - the object loaded in the application context
        // say hello :)
        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(myController.sayHello());

        // get another bean
        // call method
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayGreeting());

        // get another bean
        // call method
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayGreeting());

        // get another bean
        // call method
        System.out.println(ctx.getBean(SetterInjectedController.class).sayGreeting());

    }

}

package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestBody  Greeting greeting) {
    	System.out.println("RESPONDED");
    	System.out.println("Email"+greeting.getEmail());
    	System.out.println(greeting.getMessage());
    	System.out.println(greeting.getStarter());
    	System.out.println(greeting.getOrigin());
    	System.out.println(greeting.getName());

    	return new Greeting();
    }
    
    
}
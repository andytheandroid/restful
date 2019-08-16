package com.example.demo;

import java.net.URI;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public ResponseEntity<Void> greeting(@RequestBody  Greeting greeting) {
    	System.out.println("RESPONDED");
    	System.out.println("Email"+greeting.getEmail());
    	System.out.println(greeting.getMessage());
    	System.out.println(greeting.getStarter());
    	System.out.println(greeting.getOrigin());
    	System.out.println(greeting.getName());
    	return ResponseEntity.status(HttpStatus.FOUND)
    	        .location(URI.create("http://localhost:8086/Scheduled.html"))
    	        .build();

    	
    }
    
    
}
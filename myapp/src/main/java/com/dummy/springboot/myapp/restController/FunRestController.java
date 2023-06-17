package com.dummy.springboot.myapp.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    
    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/health")
    public String getAppHealth(){
        return "App status is up and running!";
    }

}


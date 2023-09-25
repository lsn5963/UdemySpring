package com.in28minutes.learnspringsecurity.resources;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloWorldResource {
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World";
    }
}

package com.mohini.test.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello Mohini";
    }
}

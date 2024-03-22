package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/greetings")
public class TestController {

    @GetMapping
    public String hello(){
        return "Hello test user!.";
    }
}

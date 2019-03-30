package com.example.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String get(){
        return "Hello the time is " +  new Date();
    }
}

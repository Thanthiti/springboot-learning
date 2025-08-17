package com.thanthiti.tmp.Learn_API_1.controllers;

import com.thanthiti.tmp.Learn_API_1.dtos.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApp {

    public HelloApp() {
        System.out.println(">>> HelloApp Controller Loaded!");
    }

    @GetMapping("/hello")
    public Message sayHello() {
        return new Message("Hello World");
    }

    @PostMapping("/hello")
    public Message postMethodName(@RequestBody Message message){
        return  message;
    }

}

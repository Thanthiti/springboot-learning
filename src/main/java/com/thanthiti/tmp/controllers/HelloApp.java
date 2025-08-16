package com.thanthiti.tmp.controllers;

import com.thanthiti.tmp.dtos.Message;
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

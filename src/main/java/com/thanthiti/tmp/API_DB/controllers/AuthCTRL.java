package com.thanthiti.tmp.API_DB.controllers;


import com.thanthiti.tmp.API_DB.dtos.RegisterRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthCTRL {
    // This class is currently empty, but you can add authentication-related methods here in the future.
    // For example, you might want to implement login, logout, and registration functionalities.
    @PostMapping("register")
    public String register(@RequestBody RegisterRequestDto registerRequestDto) {
        return "Register endpoint is not implemented yet.";
    }


}

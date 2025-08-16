package com.thanthiti.tmp.controllers;

import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RestController;

import repositories.userRepository;
import com.thanthiti.tmp.dtos.userDTO;

import java.util.List;

@RestController
public class userCTRL {

    @GetMapping("/user")
    public List<userDTO> getUser() {
        userRepository userRepository = new userRepository();
        return userRepository.getUsers().stream()
                .map(user -> new userDTO(user.getName(), user.getEmails()))
                .toList();
    }

    @GetMapping("/user/details")
    public String getUserDetails() {
        return "User details";
    }



}

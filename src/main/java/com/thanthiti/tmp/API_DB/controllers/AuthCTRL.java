package com.thanthiti.tmp.API_DB.controllers;


import com.thanthiti.tmp.API_DB.dtos.RegisterRequestDto;
import com.thanthiti.tmp.API_DB.models.user;
import com.thanthiti.tmp.API_DB.repositories.UserRepository;
import jakarta.validation.Valid;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthCTRL {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthCTRL(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    @PostMapping("/register")
    public String register(@Valid @RequestBody RegisterRequestDto registerRequestDto) {
        user user = new user(registerRequestDto.getName(),registerRequestDto.getEmail(),
                passwordEncoder.encode(registerRequestDto.getPassword()));
        userRepository.save(user);
        return "Registered successfully";
    }


}

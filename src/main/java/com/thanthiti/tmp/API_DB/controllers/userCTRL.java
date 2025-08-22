package com.thanthiti.tmp.API_DB.controllers;

import com.thanthiti.tmp.API_DB.dtos.userDTO;
import com.thanthiti.tmp.API_DB.models.user;
import com.thanthiti.tmp.API_DB.repositories.UserRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import java.util.List;
@RestController
public class userCTRL {
    private final UserRepository userRepository;

    public userCTRL(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user")
    public List<userDTO> getUser() {
        return userRepository.findAll().stream()
                .map(user -> new userDTO(user.getId(), user.getName(), user.getEmail()))
                .toList();
    }

    @GetMapping("/user/{id}")
    public userDTO getUserDetails(@PathVariable long id) {
        return userRepository.findById(id)
                .map(user -> new userDTO(user.getId(), user.getName(), user.getEmail()))
                .orElse(null); // ถ้าไม่เจอจะได้ null
    }

//    search by email by sending email to body to POST
@PostMapping("/user/search")
public userDTO searchUserByEmail(@Valid @RequestBody userDTO userDTO) {
    userDTO foundUser = userRepository.findByEmail(userDTO.getEmail())
            .map(user -> new userDTO(user.getId(), user.getName(), user.getEmail()))
            .orElse(null);
    if (foundUser == null) {
         throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "User not found with email: " + userDTO.getEmail());
    }
        return foundUser;
    }

    @PostMapping("/user")
    public String addUser(@RequestBody userDTO userDTO) {
        user newUser = new user(userDTO.getName(), userDTO.getEmail());
        userRepository.save(newUser);
        return "User added successfully";
    }

    @PutMapping("/user/{id}")
    public String updateUser(@PathVariable long id, @RequestBody userDTO userDTO) {
        user existingUser = userRepository.findById(id)
                .orElse(null);
        if (existingUser != null) {
            existingUser.setName(userDTO.getName());
            existingUser.setEmail(userDTO.getEmail());
            userRepository.save(existingUser);
            return "User updated successfully";
        }
        return "User updated successfully";
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable long id) {
        user userToDelete = userRepository.findById(id)
                .orElse(null);
        if (userToDelete != null) {
            userRepository.delete(userToDelete);
            return "User deleted successfully";
        }
        return "User not found";
    }
}

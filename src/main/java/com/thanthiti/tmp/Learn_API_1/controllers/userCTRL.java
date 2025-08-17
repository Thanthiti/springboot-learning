package com.thanthiti.tmp.Learn_API_1.controllers;

import com.thanthiti.tmp.Learn_API_1.models.user;
import com.thanthiti.tmp.Learn_API_1.repositories.userRepository;
import org.springframework.web.bind.annotation.*;


import com.thanthiti.tmp.Learn_API_1.dtos.userDTO;

import java.util.List;
@RestController
public class userCTRL {
    private final userRepository userRepository;

    public userCTRL(userRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user")
    public List<userDTO> getUser() {
        return userRepository.getUsers().stream()
                .map(user -> new userDTO(user.getId(), user.getName(), user.getEmails()))
                .toList();
    }

    @GetMapping("/user/{id}")
    public userDTO getUserDetails(@PathVariable String id) {
        return userRepository.getUsers().stream()
                .filter(user -> user.getId().equals(id))
                .map(user -> new userDTO(user.getId(), user.getName(), user.getEmails()))
                .findFirst()
                .orElse(null); // ถ้าไม่เจอจะได้ null
    }

    @PostMapping("/user")
    public String addUser(@RequestBody userDTO userDTO) {
        userRepository.addUser(new user(
                userDTO.getName(),
                userDTO.getEmail()
        ));
        return "User added successfully";
    }

    @PutMapping("/user/{id}")
    public String updateUser(@PathVariable String id, @RequestBody userDTO userDTO) {
        user updatedUser = new user(id, userDTO.getName(), userDTO.getEmail());
        userRepository.updateUser(id, updatedUser);
        return "User updated successfully";
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable String id) {
        user userToDelete = userRepository.getUsers().stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
        if (userToDelete != null) {
            userRepository.removeUser(userToDelete);
            return "User deleted successfully";
        }
        return "User not found";
    }
}

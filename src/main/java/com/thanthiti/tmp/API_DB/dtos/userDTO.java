package com.thanthiti.tmp.API_DB.dtos;

import jakarta.validation.constraints.NotBlank;

public class userDTO {
    private long id;
    private String name;
    @NotBlank(message =  "Email is required")
    private String email;

    public userDTO() {
    }

    public userDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public userDTO(long id,String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}

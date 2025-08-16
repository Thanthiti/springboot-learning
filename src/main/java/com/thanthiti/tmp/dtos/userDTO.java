package com.thanthiti.tmp.dtos;

public class userDTO {

    private String name;
    private String email;

    public userDTO() {
    }

    public userDTO(String name, String email) {
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

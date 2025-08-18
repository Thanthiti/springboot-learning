package com.thanthiti.tmp.API_DB.dtos;

public class userDTO {
    private long id;
    private String name;
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


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

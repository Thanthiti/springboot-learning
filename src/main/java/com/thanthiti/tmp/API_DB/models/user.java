package com.thanthiti.tmp.API_DB.models;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class user {
//        name,email
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String name;
    private  String email;

    public user(){

    }

    public user(long id, String name, String emails) {
        this.id = id;
        this.name = name;
        this.email = emails;
    }

    public user(String name, String emails) {
        this.name = name;
        this.email = emails;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String emails) {
        this.email = emails;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getId() {
        return id;
    }


}


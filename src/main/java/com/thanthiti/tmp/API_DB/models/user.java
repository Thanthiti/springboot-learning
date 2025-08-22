package com.thanthiti.tmp.API_DB.models;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class user {
//        name,email
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private  String email;

    @Column(nullable = false)
    private  String password;

    public user(){

    }

    public user(long id, String name, String emails) {
        this.id = id;
        this.name = name;
        this.email = emails;
    }

    public user(String name, String emails, String password) {
        this.name = name;
        this.email = emails;
        this.password = password;
    }
    public user(String name, String emails) {
        this.name = name;
        this.email = emails;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String emails) {
        this.email = emails;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    public long getId() {
        return id;
    }


}


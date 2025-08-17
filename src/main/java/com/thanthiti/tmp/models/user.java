package com.thanthiti.tmp.models;

import org.apache.catalina.User;

public class user {
//        name,email
    private  String id;
    private String name;
    private  String emails;

    public user(){

    }

    public user(String name, String emails) {
        System.out.println(name);
        System.out.println(emails);

        this.name = name;
        this.emails = emails;
        this.id = String.valueOf(System.currentTimeMillis()); // Simple ID generation based on current time

            }

    public user(String id, String name, String emails) {
        this.id = id;
        this.name = name;
        this.emails = emails;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public String getEmails() {
        return emails;
    }

    public String getId() {
        return id;
    }


}


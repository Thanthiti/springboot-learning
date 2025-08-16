package com.thanthiti.tmp.models;

import org.apache.catalina.User;

public class user {
//        name,email
    private String name;
    private  String emails;

    public user(){

    }
    public user(String name,String emails){
        this.name = name;
        this.emails = emails;
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



}


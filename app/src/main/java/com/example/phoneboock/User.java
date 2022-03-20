package com.example.phoneboock;

public class User {
    private String lastname;
    private String name;
    private String phonenumber;

    public User(String lastname, String name, String phonenumber) {
        this.lastname = lastname;
        this.name = name;
        this.phonenumber = phonenumber;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}

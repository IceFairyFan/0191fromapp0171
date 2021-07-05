package com.application.posapplication.model;

public class RegisterModel {
    private String email;
    private String password;
    private String repassword;
    private String name;
    private String lastName;

    public RegisterModel(String email, String password, String name, String lastName) {
        this.email = email;
        this.password = password;
        this.repassword = repassword;
        this.name = name;
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRepassword() {
        return repassword;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public void setFirstName(String firstName) {
        this.name = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

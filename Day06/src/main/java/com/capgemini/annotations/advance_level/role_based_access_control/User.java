package com.capgemini.annotations.advance_level.role_based_access_control;

public class User {

    private String role;

    public User(String role){
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}

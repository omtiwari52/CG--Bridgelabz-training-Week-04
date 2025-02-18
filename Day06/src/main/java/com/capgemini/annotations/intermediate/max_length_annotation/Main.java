package com.capgemini.annotations.intermediate.max_length_annotation;

public class Main {
    public static void main(String[] args) {

        try {
            User validUser = new User("Om Tiwari");
            System.out.println("Valid username: " + validUser.getUserName());

            // This should throw an exception
            User invalidUser = new User("VeryLongUsername");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

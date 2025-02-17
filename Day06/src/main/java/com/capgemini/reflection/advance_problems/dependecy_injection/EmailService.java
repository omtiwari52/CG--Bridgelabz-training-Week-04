package com.capgemini.reflection.advance_problems.dependecy_injection;


public class EmailService implements Service {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email Sent: " + message);
    }
}
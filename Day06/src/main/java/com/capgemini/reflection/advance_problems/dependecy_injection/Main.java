package com.capgemini.reflection.advance_problems.dependecy_injection;

public class Main {
    public static void main(String[] args) {
        try {
            DIContainer container = new DIContainer();
            UserController userController = container.getInstance(UserController.class);
            userController.sendNotification();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

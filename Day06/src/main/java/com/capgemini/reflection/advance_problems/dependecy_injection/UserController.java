package com.capgemini.reflection.advance_problems.dependecy_injection;

public class UserController {
    @Inject  // Marks field for dependency injection
    private Service service;

    public void sendNotification() {
        service.sendMessage("Welcome to Dependency Injection!");
    }
    public Service getService() {
        return service;
    }

}
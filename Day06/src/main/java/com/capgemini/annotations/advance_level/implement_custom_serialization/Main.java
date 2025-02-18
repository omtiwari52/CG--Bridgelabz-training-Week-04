package com.capgemini.annotations.advance_level.implement_custom_serialization;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        try {
            User user = new User("Shruti", 25);
            String json = User.serializeToJson(user);
            System.out.println(json);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

package com.capgemini.reflection.intermediate_problems.access_and_modify_static_fields;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        try {
            // Get the class object
            Class<?> configClass = Configuration.class;

            // Access the private static field
            Field apiKeyField = configClass.getDeclaredField("API_KEY");

            // Make it accessible for modification
            apiKeyField.setAccessible(true);

            // Modify the value of the static field
            apiKeyField.set(null, "NEW_SECRET_KEY");

            // Print the modified value
            Configuration.displayAPIKey();

        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("Exception Caught "+ e.getMessage());
        }
    }
}

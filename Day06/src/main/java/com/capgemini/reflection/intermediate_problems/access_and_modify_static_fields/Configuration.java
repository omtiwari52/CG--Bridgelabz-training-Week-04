package com.capgemini.reflection.intermediate_problems.access_and_modify_static_fields;

public class Configuration {
    // Private static field
    private static String API_KEY = "DEFAULT_KEY";

    // Method to display API key
    public static void displayAPIKey() {
        System.out.println("API_KEY: " + API_KEY);
    }
}

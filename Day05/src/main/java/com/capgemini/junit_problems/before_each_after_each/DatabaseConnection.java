package com.capgemini.junit_problems.before_each_after_each;

public class DatabaseConnection {

    private boolean isConnected = false;

    // Method to establish a database connection
    public void connect() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("Database connection established.");
        } else {
            System.out.println("Already connected to the database.");
        }
    }

    // Method to close the database connection
    public void disconnect() {
        if (isConnected) {
            isConnected = false;
            System.out.println("Database connection closed.");
        } else {
            System.out.println("No active connection to close.");
        }
    }

    // Method to check if the database is connected
    public boolean isConnected() {
        return isConnected;
    }
}

package com.capgemini.junit_problems.before_each_after_each;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("1. Connect to Database \n2. Disconnect from Database \n3. Check Connection Status \n4. Exit \nEnter your choice: ");

                int choice;
                try {
                    choice = Integer.parseInt(br.readLine().trim());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a number.");
                    continue;  // Skip the rest of the loop and ask again
                }

                switch (choice) {
                    case 1:
                        dbConnection.connect();
                        break;

                    case 2:
                        dbConnection.disconnect();
                        break;

                    case 3:
                        System.out.println("Connection Status: " + (dbConnection.isConnected() ? "Connected" : "Disconnected"));
                        break;

                    case 4:
                        System.out.println("Exiting program...");
                        return;

                    default:
                        System.out.println("Invalid choice! Please enter a valid option.");
                }
            }
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

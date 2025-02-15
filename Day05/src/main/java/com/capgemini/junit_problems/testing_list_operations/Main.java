package com.capgemini.junit_problems.testing_list_operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListManager listManager = new ListManager();
        List<Integer> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("\n1. Add Element \n2. Remove Element \n3. Get List Size \n4. Exit \nEnter your choice: ");

                int choice = Integer.parseInt(br.readLine().trim());

                switch (choice) {
                    case 1:
                        System.out.print("Enter element to add: ");
                        int addElement = Integer.parseInt(br.readLine().trim());
                        listManager.addElement(list, addElement);
                        System.out.println(addElement + " added to the list.");
                        break;

                    case 2:
                        System.out.print("Enter element to remove: ");
                        int removeElement = Integer.parseInt(br.readLine().trim());
                        if (listManager.removeElement(list, removeElement)) {
                            System.out.println(removeElement + " removed from the list.");
                        } else {
                            System.out.println(removeElement + " not found in the list.");
                        }
                        break;

                    case 3:
                        System.out.println("Current list size: " + listManager.getSize(list));
                        break;

                    case 4:
                        System.out.println("Exiting program...");
                        return;

                    default:
                        System.out.println("Invalid choice! Please enter a valid option.");
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

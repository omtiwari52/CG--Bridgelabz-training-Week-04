package com.capgemini.reflection.basic_problems.get_class_information;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter class name: ");
        String className = scanner.nextLine();
        scanner.close();

        try {
            ReflectionUtil.getClassInfo(className);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        }
    }
}

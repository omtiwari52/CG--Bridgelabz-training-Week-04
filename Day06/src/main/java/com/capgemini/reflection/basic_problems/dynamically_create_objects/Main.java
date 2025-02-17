package com.capgemini.reflection.basic_problems.dynamically_create_objects;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            Class<?> cls = Student.class;
            // Get constructor
            Constructor<?> constructor = cls.getConstructor(String.class);

            //get name as input
            System.out.print("Name: ");
            String name = br.readLine().trim();

            // Create instance dynamically
            Student student = (Student) constructor.newInstance(name);
            // Call method
            student.display();
        }
    }
}

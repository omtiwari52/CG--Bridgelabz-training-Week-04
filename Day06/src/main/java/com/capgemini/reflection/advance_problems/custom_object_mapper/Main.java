package com.capgemini.reflection.advance_problems.custom_object_mapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter name: ");
            String name = reader.readLine();

            System.out.print("Enter age: ");
            Integer age = Integer.parseInt(reader.readLine());

            Map<String, Object> properties = new HashMap<>();
            properties.put("name", name);
            properties.put("age", age);

            Person person = new ObjectMapper().toObject(Person.class, properties);
            System.out.println(person);
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}
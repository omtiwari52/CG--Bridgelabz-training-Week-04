package com.capgemini.reflection.basic_problems.dynamically_create_objects;

public class Student {

    private String name;


    public Student(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("Student Name: " + name);
    }

    public String getName() {
        return name;
    }
}

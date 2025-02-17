package com.capgemini.reflection.basic_problems.access_private_field;

public class Person {

    private int age; //private field age

    Person(int age){       //constructor
        this.age = age;
    }

    //method to display age
    public void displayAge(){
        System.out.println("Age:" + age);
    }

    public int getAge() {
        return age;
    }
}

package com.capgemini.annotations.using_override_correctly;

public class Dog extends Animal{

    @Override
    void makeSound(){
        System.out.println("Dog barks");
    }
}

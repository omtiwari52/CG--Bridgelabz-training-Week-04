package com.capgemini.annotations.using_override_correctly;

public class Main {

    public static void main(String[] args) {

        Animal myAnimal = new Animal();
        myAnimal.makeSound();

        Animal myDog = new Dog();
        myDog.makeSound();
    }
}

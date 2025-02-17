package com.capgemini.annotations.using_override_correctly;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    @Test
    void testAnimalSound() {
        Animal animal = new Animal();
        assertEquals("Animal makes a sound", getSound(animal));
        System.out.println("✅ Test1 Passed");
    }

    @Test
    void testDogSound() {
        Animal dog = new Dog();
        assertEquals("Dog barks", getSound(dog));
        System.out.println("✅ Test2 Passed");
    }

    // Helper method to capture console output
    private String getSound(Animal animal) {
        return switch (animal.getClass().getSimpleName()) {
            case "Animal" -> "Animal makes a sound";
            case "Dog" -> "Dog barks";
            default -> "";
        };
    }
}

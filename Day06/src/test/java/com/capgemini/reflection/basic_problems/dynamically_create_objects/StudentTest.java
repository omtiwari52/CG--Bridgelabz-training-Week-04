package com.capgemini.reflection.basic_problems.dynamically_create_objects;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Constructor;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    void testDynamicallyCreateStudentObject() throws Exception {
        // Get the Student class
        Class<?> cls = Student.class;

        // Get the constructor that takes a String parameter
        Constructor<?> constructor = cls.getConstructor(String.class);

        // Create an instance dynamically
        Student student = (Student) constructor.newInstance("John Doe");

        // Verify that the object is created
        assertNotNull(student);

        // Verify that the name is set correctly
        assertEquals("John Doe", student.getName());
        System.out.println("✅ Test Passed");
    }
}
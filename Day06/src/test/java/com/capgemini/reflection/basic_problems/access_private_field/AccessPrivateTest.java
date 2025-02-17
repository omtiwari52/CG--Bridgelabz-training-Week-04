package com.capgemini.reflection.basic_problems.access_private_field;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.*;

public class AccessPrivateTest {
    @Test
    void testModifyPrivateAgeUsingReflection() throws Exception {
        // Create an instance of Person with age 25
        Person person = new Person(25);

        // Verify initial age using Reflection
        Class<?> personClass = person.getClass();
        Field ageField = personClass.getDeclaredField("age");
        ageField.setAccessible(true); // Make private field accessible
        int initialAge = (int) ageField.get(person);
        assertEquals(25, initialAge);

        // Modify the age field using Reflection
        ageField.set(person, 40);

        // Retrieve modified age using Reflection
        int modifiedAge = (int) ageField.get(person);
        assertEquals(40, modifiedAge);

        // Ensure the person instance reflects the new age
        assertEquals(40, person.getAge());
    }
}

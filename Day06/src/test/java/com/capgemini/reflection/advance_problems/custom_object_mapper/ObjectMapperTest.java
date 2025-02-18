package com.capgemini.reflection.advance_problems.custom_object_mapper;

import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ObjectMapperTest {

    private ObjectMapper mapper;

    @Before
    public void setup() {
        mapper = new ObjectMapper();
    }

    @Test
    public void testToObject() {
        // Arrange
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "John veer singh");
        properties.put("age", 30);

        // Act
        Person person = mapper.toObject(Person.class, properties);

        // Assert
        assertNotNull(person);
        assertEquals("John veer singh", person.getName());
        assertEquals(30, person.getAge());
    }


    @Test(expected = RuntimeException.class)
    public void testToObjectInvalidClass() {
        // Arrange
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "John Doe");
        properties.put("age", 30);

        // Act
        mapper.toObject(String.class, properties); // String type converted
    }


}
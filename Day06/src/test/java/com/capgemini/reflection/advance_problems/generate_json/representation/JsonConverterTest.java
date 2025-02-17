package com.capgemini.reflection.advance_problems.generate_json.representation;
import static org.junit.jupiter.api.Assertions.*;
import com.capgemini.reflection.advance_problems.generate_json_representation.JsonConvertor;
import com.capgemini.reflection.advance_problems.generate_json_representation.Person;
import org.junit.jupiter.api.Test;

public class JsonConverterTest {

    @Test
    void testToJson() {
        Person person = new Person("Harsh veer singh",25,true);
        String expectedJson = "{\"name\":\"Harsh veer singh\", \"age\":25, \"accessible\":true}";
        String actualJson = JsonConvertor.toJson(person);
        assertEquals(expectedJson, actualJson);
    }

    @Test
    void testToJsonWithNull() {
        Person person = new Person(null, 30, false);
        String expectedJson = "{\"name\":null, \"age\":30, \"accessible\":false}";
        String actualJson = JsonConvertor.toJson(person);
        assertEquals(expectedJson, actualJson);
    }
}


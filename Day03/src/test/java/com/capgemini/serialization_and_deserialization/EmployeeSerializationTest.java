package com.capgemini.serialization_and_deserialization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.*;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeSerializationTest {
    private List<Employee> employeeList;
    String FILE_PATH = "src/main/java/com/capgemini/serialization_and_deserialization/employeeInfo.ser";

    @BeforeEach
    void setUp() {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee("Harsh Veer Singh","1", "HR", 50000.0));
        employeeList.add(new Employee("Om Tiwari","2", "CSE", 60000.0));
        employeeList.add(new Employee("Durgesh","3", "IT", 70000.0));
        employeeList.add(new Employee("Ruchika","4", "Finance", 80000.0));
    }

    @Test
    void testSerialization() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(employeeList);
        } catch (IOException e) {
            fail("Serialization failed: " + e.getMessage());
        }

        File file = new File(FILE_PATH);
        assertTrue(file.exists(), "Serialized file should exist");
    }

    @Test
    void testDeserialization() {
        // First, serialize the data
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(employeeList);
        } catch (IOException e) {
            fail("Serialization failed: " + e.getMessage());
        }

        // Now, deserialize the data
        List<Employee> deserializedEmployees = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            deserializedEmployees = (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            fail("Deserialization failed: " + e.getMessage());
        }
        // Validate the retrieved list is not null
        assertNotNull(deserializedEmployees, "Deserialized list should not be null");
        assertEquals(employeeList.size(), deserializedEmployees.size(), "Employee count should match");

        // Check if each employee matches
        for (int i = 0; i < employeeList.size(); i++) {
            Employee original = employeeList.get(i);
            Employee deserialized = deserializedEmployees.get(i);

            assertEquals(original.getId(), deserialized.getId(), "ID should match");
            assertEquals(original.getEmployeeName(), deserialized.getEmployeeName(), "Name should match");
            assertEquals(original.getDepartment(), deserialized.getDepartment(), "Department should match");
            assertEquals(original.getSalary(), deserialized.getSalary(), "Salary should match");
        }
    }

}

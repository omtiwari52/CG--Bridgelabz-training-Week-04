package com.capgemini.map_interface.group_objects_by_property;

import org.junit.jupiter.api.Test;

import java.util.*;

import static com.capgemini.map_interface.group_objects_by_property.EmployeeGrouper.groupByDepartment;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeGrouperTest {

    @Test
    void testSingleDepartment() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "HR"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> actualOutput = groupByDepartment(employees);

        assertEquals(1, actualOutput.size());
        assertTrue(actualOutput.containsKey("HR"));
        assertEquals(3, actualOutput.get("HR").size());
    }
}

package com.capgemini.map_interface.group_objects_by_property;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static com.capgemini.map_interface.group_objects_by_property.EmployeeGrouper.groupByDepartment;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Durgesh", "HR"),
                new Employee("Deepraj", "IT"),
                new Employee("Bipin", "HR"),
                new Employee("Om", "IT"),
                new Employee("Harsh", "Finance")
        );
        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);

        System.out.println(groupedEmployees);
    }
}
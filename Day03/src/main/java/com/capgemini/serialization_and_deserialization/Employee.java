package com.capgemini.serialization_and_deserialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private String employeeName;
    private String id;
    private String department;
    private double salary;

    Employee(String employeeName,String id, String department, double salary){
        this.department = department;
        this.employeeName = employeeName;
        this.id = id;
        this.salary = salary;
    }
    // Getter to get the private values
    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getId() {
        return id;
    }

    public void displayEmployeeDetails(){
        System.out.println("-----------------");
        System.out.println("Name of the employee: " + employeeName +
                 "\nId of the employee: " + id +
                 "\nSalary of the employee: " + salary +
                 "\nDepartment of the employee: " + department
        );
        System.out.println("-----------------");
    }


}

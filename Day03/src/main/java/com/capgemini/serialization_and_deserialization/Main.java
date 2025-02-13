package com.capgemini.serialization_and_deserialization;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Employee list to add the information in the ser file
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee("Harsh veer singh","id1","HR",100000000));
        employee.add(new Employee("Om tiwari","id2","CSE",100));
        employee.add(new Employee("Durgesh","id3","HR",-500));
        employee.add(new Employee("Ruchika","id4","HR",300));

        // Creating the file path
        String fileName = "employeeInfo.ser";
        String currentPath = "src/main/java/com/capgemini/serialization_and_deserialization/";
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(currentPath + fileName))) {
            oos.writeObject(employee);
            System.out.println("Employee list has been serialized");

        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("File not found exception occurred please enter the correct path of the file");
        }catch (IOException e){
            System.out.println("IO EXCEPTION OCCURRED " + e.getMessage());
        }

        // Deserializable employee file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(currentPath + fileName))) {
            List<Employee> employees = (List<Employee>) ois.readObject();
            System.out.println("Deserialized Employee List:");
            for (Employee emp : employees) {
                emp.displayEmployeeDetails();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error occurred during deserialization.");
        }
    }
}

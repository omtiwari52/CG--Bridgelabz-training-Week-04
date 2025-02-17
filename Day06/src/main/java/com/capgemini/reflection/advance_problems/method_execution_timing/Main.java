package com.capgemini.reflection.advance_problems.method_execution_timing;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            // Create an instance of the target class
            SampleOperations operations = new SampleOperations();

            // Get the class object
            Class<?> cls = operations.getClass();

            // Define the method names to test
            String[] methodNames = {"fastMethod", "slowMethod"};

            for (String methodName : methodNames) {
                // Get the method dynamically
                Method method = cls.getMethod(methodName);

                // Measure execution time
                long startTime = System.nanoTime();
                method.invoke(operations); // Invoke the method dynamically
                long endTime = System.nanoTime();

                // Calculate and print execution time in milliseconds
                System.out.println(methodName + " executed in " + (endTime - startTime) / 1_000_000.0 + " ms");
            }
        } catch (Exception e) {
            System.out.println("Exception caught "+e.getMessage());
        }
    }
}

package com.capgemini.reflection.intermediate_problems.dynamic_method_invocation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            // Create an instance of MathOperations
            MathOperations mathOps = new MathOperations();

            // Get user input for method name
            System.out.println("Enter method name \n1. add \n2. subtract \n3. multiply: ");
            String methodName = br.readLine().trim();

            // Get user input for method parameters
            System.out.print("Enter first number: ");
            int num1 = Integer.parseInt(br.readLine());

            System.out.print("Enter second number: ");
            int num2 = Integer.parseInt(br.readLine());

            // Get the class object
            Class<?> mathClass = mathOps.getClass();

            // Get the method dynamically based on user input
            Method method = mathClass.getMethod(methodName, int.class, int.class);

            // Invoke the method dynamically
            int result = (int) method.invoke(mathOps, num1, num2);

            // Display result
            System.out.println("Result: " + result);

        } catch (NoSuchMethodException e) {
            System.out.println("Invalid method name! Please enter a valid method.");
        } catch (IOException | ReflectiveOperationException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}

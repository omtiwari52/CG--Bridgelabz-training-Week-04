package com.capgemini.junit_problems.testing_exception_handling;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathUtils {
    // Method to divide two numbers
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter first number: ");
            int a = Integer.parseInt(reader.readLine());

            System.out.print("Enter second number: ");
            int b = Integer.parseInt(reader.readLine());

            int result = divide(a, b);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid input! Please enter valid integers.");
        }
    }
}


package com.capgemini.junit_problems.testing_string_utility_methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.capgemini.junit_problems.testing_string_utility_methods.StringUtils.*;

public class Main {
    public static void main(String[] args) {
        // Try-with-resources ensures BufferedReader is closed automatically
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a string: ");
            String input = reader.readLine();

            System.out.println("Reversed String: " + reverse(input));
            System.out.println("Is Palindrome: " + isPalindrome(input));
            System.out.println("Uppercase: " + toUpperCase(input));

        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }

}

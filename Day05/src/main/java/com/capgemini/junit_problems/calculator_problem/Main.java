package com.capgemini.junit_problems.calculator_problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        //use try and catch to handle exception if occurs
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            //get user input
            System.out.print("1. Add \n2. Subtract \n3. Multiply \n4. Divide \nEnter your Choice: ");
            int choice = Integer.parseInt(br.readLine().trim());

            System.out.print("Enter first Number: ");
            int a = Integer.parseInt(br.readLine().trim());

            System.out.print("Enter second Number: ");
            int b = Integer.parseInt(br.readLine().trim());

            try {
                switch (choice){
                    case 1:
                        System.out.println("Addition of numbers is: "+ Calculator.add(a,b));
                        break;
                    case 2:
                        System.out.println("Subtraction of numbers is: "+ Calculator.subtract(a,b));
                        break;
                    case 3:
                        System.out.println("Multiplication of numbers is: "+ Calculator.multiply(a,b));
                        break;
                    case 4:
                        System.out.println("Division of numbers is: "+ Calculator.divide(a,b));
                        break;
                    default:
                        System.out.println("Invalid choice! Please select a valid operation.");
                }
            }catch (ArithmeticException e){
                System.out.println("Exception caught: "+ e.getMessage());
            }
        }catch (IOException e){
            System.out.println("Exception caught "+e.getMessage());
        }
    }
}

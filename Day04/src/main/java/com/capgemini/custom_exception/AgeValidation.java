package com.capgemini.custom_exception;

public class AgeValidation {

    //method to check if the age is valid or not
    public static boolean validateAge(int age) throws InvalidAgeException{
        if (age < 18){
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Access granted!");
        return true;
    }
}

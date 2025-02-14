package com.capgemini.custom_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        //use try and catch to handle exception which may come during the execution
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            //get input from user
            System.out.print("Enter age: ");
            int age = Integer.parseInt(br.readLine());
            AgeValidation.validateAge(age);
        } catch (IOException e) {
            System.out.println("Exception caught IOException "+ e.getMessage());
        } catch (InvalidAgeException e){
            System.out.println("Exception caught Invalid age exception: "+e.getMessage());
        }
    }
}

package com.capgemini.regex_problems.validate_a_username;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            System.out.print("Enter the Username : ");

            String username = br.readLine().trim();

            if(ValidateUsername.isValid(username)){
                System.out.println("Valid");
            } else if (!ValidateUsername.isValid(username)) {
                System.out.println("InValid");
            }
        }catch (IOException e){
            System.out.println("Exception caught "+e.getMessage());
        }
    }
}

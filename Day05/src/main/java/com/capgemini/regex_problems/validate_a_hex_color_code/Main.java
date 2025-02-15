package com.capgemini.regex_problems.validate_a_hex_color_code;

import com.capgemini.regex_problems.validate_a_username.ValidateUsername;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        //use try and catch to handle exception if occurs
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            //get user input
            System.out.print("Enter the color code: ");
            String colorCode = br.readLine().trim();

            System.out.println((ValidateHexColorCode.isValid(colorCode) ? "Valid" : "Invalid"));
        }catch (IOException e){
            System.out.println("Exception caught "+e.getMessage());
        }
    }
}

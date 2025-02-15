package com.capgemini.regex.validate_license_plate_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter the License plate number: ");
            String text = br.readLine().trim();
            if (ValidateRegex.validate(text)){
                System.out.println("Valid License plate number " + text);
            }else System.out.println("Invalid License plate number");
        }catch (IOException e){
            System.out.println("Exception caught IO Exception " + e.getMessage());
        }
    }
}

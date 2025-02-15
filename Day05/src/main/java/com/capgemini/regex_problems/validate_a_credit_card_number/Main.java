package com.capgemini.regex_problems.validate_a_credit_card_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        //use try and catch to handle exception if occurs
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            //get user input
            System.out.print("1. VisaCard \n2. MasterCard \nEnter your choice: ");
            String choice = br.readLine().trim().toLowerCase();

            System.out.print("Enter your card Number: ");
            String cardNumber = br.readLine().trim();

            // Check validity based on user choice
            boolean isValid = switch (choice) {
                case "visacard" -> ValidateCard.isVisaCard(cardNumber);
                case "mastercard" -> ValidateCard.isMasterCard(cardNumber);
                default -> false;
            };
            System.out.println(isValid ? "Valid" : "Invalid");

        }catch (IOException e){
            System.out.println("Exception caught "+e.getMessage());
        }
    }
}

package com.capgemini.regex.extract_emails_from_text;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter the text containing the email addresses: ");
            String text = br.readLine().trim();

            // Extract and prints the email address in the string
            if (!ExtractEmailAddress.extractEmailAddresses(text).isEmpty()){
                System.out.println(ExtractEmailAddress.extractEmailAddresses(text).toString());
            }else System.out.println("No email address found");

        }catch (IOException e){
            System.out.println("Exception caught IO Exception " + e.getMessage());
        }
    }
}

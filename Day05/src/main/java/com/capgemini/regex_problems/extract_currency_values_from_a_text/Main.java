package com.capgemini.regex_problems.extract_currency_values_from_a_text;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        //use try and catch to handle exception if occurs
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            //get user input
            System.out.print("Enter your text: ");
            String text = br.readLine().trim();

            System.out.println("Currencies are: "+ ExtractCurrency.extractCurrency(text));

        }catch (IOException e){
            System.out.println("Exception caught "+e.getMessage());
        }
    }
}

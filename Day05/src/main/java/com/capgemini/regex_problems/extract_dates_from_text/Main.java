package com.capgemini.regex.extract_dates_from_text;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter the text containing the Dates: ");
            String text = br.readLine().trim();

            // Extract and prints the dates in the string
            if (!ExtractDatesFromText.extractDates(text).isEmpty()){
                System.out.println(ExtractDatesFromText.extractDates(text));
            }else System.out.println("No dates found");

        }catch (IOException e){
            System.out.println("Exception caught IO Exception " + e.getMessage());
        }
    }
}

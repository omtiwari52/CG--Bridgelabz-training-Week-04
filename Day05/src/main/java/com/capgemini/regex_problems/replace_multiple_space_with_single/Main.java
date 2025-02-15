package com.capgemini.regex.replace_multiple_space_with_single;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter the text: ");
            String text = br.readLine().trim();

            System.out.println("String after removing extra multiple space:");
            System.out.println(ReplaceMultipleSpaces.replaceMultipleSpaces(text));


        }catch (IOException e){
            System.out.println("Exception caught IO Exception " + e.getMessage());
        }
    }
}

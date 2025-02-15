package com.capgemini.regex.repeating_word_in_a_sentence;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter the text: ");
            String text = br.readLine().trim();

            System.out.println(FindRepeatingWords.findRepeatingWords(text));


        }catch (IOException e){
            System.out.println("Exception caught IO Exception " + e.getMessage());
        }
    }
}

package com.capgemini.regex_problems.censor_bad_words_in_a_sentence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //use try and catch to handle exception if occurs
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            //get user input
            ArrayList<String> badWords = new ArrayList<>(Arrays.asList("damn", "stupid"));
            System.out.print("Enter your sentence: ");
            String text = br.readLine().trim();
            System.out.println(CensorBadWords.sensor(badWords, text));
        }catch (IOException e){
            System.out.println("Exception caught "+e.getMessage());
        }
    }
}

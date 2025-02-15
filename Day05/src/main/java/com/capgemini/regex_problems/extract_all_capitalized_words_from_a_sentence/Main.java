package com.capgemini.regex_problems.extract_all_capitalized_words_from_a_sentence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //use try and catch to handle exception if occurs
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            //get user input
            System.out.print("Enter your sentence: ");
            String text = br.readLine().trim();

            ArrayList<String> ans = new ArrayList<>(ExtractCapitalWord.findCapital(text));
            System.out.println(ans);
        }catch (IOException e){
            System.out.println("Exception caught "+e.getMessage());
        }
    }
}

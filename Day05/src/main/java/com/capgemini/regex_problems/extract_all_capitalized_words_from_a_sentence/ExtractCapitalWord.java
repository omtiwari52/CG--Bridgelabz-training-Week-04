package com.capgemini.regex_problems.extract_all_capitalized_words_from_a_sentence;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalWord {

    //method to extract all capital word from a sentence
    public static ArrayList<String> findCapital(String text){

        ArrayList<String> ans = new ArrayList<>();
        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            ans.add(matcher.group());
        }
        return ans;
    }
}

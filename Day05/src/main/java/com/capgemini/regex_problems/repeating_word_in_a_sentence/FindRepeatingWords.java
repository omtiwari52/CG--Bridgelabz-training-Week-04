package com.capgemini.regex.repeating_word_in_a_sentence;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWords {
    // Find repeat word in a sentence
    public static ArrayList<String> findRepeatingWords(String text){
        String regex = "\\b(\\w+)\\s+\\1\\b";
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) list.add(matcher.group(1));

        return list;
    }
}

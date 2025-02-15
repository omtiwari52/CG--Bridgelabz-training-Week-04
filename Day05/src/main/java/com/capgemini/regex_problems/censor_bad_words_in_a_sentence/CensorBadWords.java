package com.capgemini.regex_problems.censor_bad_words_in_a_sentence;

import java.util.List;

public class CensorBadWords {

    //method to sensor bad words
    public static String sensor(List<String> badWords, String str){

        for(String str2 : badWords){
            str = str.replaceAll("(?i)\\b" + str2 + "\\b", "****");
        }
        return str;
    }
}

package com.capgemini.regex_problems.extract_links_from_a_web_page;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLink {

    //method to extract link from a web page
    public static ArrayList<String> extractLink(String website){

        ArrayList<String> ans = new ArrayList<>();

        String regex = "https?://(www\\\\.)?([a-zA-Z0-9.-]+)";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(website);

        while(matcher.find()){
            ans.add(matcher.group());
        }
        return ans;
    }
}

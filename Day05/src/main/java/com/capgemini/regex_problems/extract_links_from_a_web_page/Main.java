package com.capgemini.regex_problems.extract_links_from_a_web_page;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //use try and catch to handle exception if occurs
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            //get user input
            System.out.print("Enter your website url: ");
            String text = br.readLine().trim();

            System.out.println(ExtractLink.extractLink(text));

        }catch (IOException e){
            System.out.println("Exception caught "+e.getMessage());
        }
    }
}

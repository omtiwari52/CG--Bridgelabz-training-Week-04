package com.capgemini.read_a_large_file_ine_by_line;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        //use try and catch to catch IO Exception if occurs
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            //get user input for the name of source file
            System.out.println("Enter the source file name: ");
            String sourceFileName = br.readLine().trim();

            //invoke method which file and print the line containing error keyword
            System.out.println(ReadFileAndReturnLineContainingError.readFile(sourceFileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

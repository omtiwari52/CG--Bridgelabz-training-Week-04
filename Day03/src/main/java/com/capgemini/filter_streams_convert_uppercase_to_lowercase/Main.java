package com.capgemini.filter_streams_convert_uppercase_to_lowercase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        //use try and catch to catch IO Exception if occurs
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the source file name: ");
            String sourceFileName = br.readLine().trim();
            System.out.println("Enter the destination file name: ");
            String destinationFileName = br.readLine().trim();

           ConvertUpperCaseToLowerCase.readConvertAndWrite(sourceFileName, destinationFileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

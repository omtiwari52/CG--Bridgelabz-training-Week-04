package com.capgemini.checked_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            System.out.print("Enter your file name: ");
            String fileName = br.readLine();
            ReadFileAndHandleException.readFile(fileName);
        } catch (IOException e) {
            System.out.println("Exception caught IOException: "+e.getMessage());
        }
    }
}

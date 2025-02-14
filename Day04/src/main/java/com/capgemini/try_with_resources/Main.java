package com.capgemini.try_with_resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            System.out.print("Enter your file name: ");
            String fileName = br.readLine();
            ReadFileTryWithResources.readFile(fileName);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
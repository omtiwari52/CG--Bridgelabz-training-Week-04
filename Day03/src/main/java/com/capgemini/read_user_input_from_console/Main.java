package com.capgemini.read_user_input_from_console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)  {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter your name: ");
            String name = br.readLine().trim();
            System.out.println("Enter your age: ");
            int age = Integer.parseInt(br.readLine().trim());
            System.out.println("Enter your proLang: ");
            String proLang = br.readLine().trim();
            System.out.println("Enter the file name: ");
            String fileName = br.readLine().trim();

            ReadUserInputAndWrite.writeFile(fileName, name, age, proLang);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

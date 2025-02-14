package com.capgemini.try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileTryWithResources {
    //method to read file
    public static boolean readFile(String filePath) throws IOException {

        //create a variable and store file path
        String myFile = "src/main/java/com/capgemini/checked_exception/" + filePath;

        try (BufferedReader br = new BufferedReader(new FileReader(myFile))) {
            String line;
            System.out.println("File content start:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("File content end");
        } catch (IOException e) {
            System.out.println("Exception Caught : " + e.getMessage());
            throw new IOException();
        }
        return true;
    }
}

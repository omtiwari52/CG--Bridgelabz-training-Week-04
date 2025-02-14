package com.capgemini.checked_exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileAndHandleException {

    //method to read file
    public static boolean readFile(String filePath){

        //create a variable and store file path
        String myFile = "src/main/java/com/capgemini/checked_exception/" + filePath;

        try (BufferedReader br = new BufferedReader(new FileReader(myFile))){
            String line;
            System.out.println("File content start:");
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            System.out.println("File content end");
        }catch (FileNotFoundException e){
            System.out.println("Exception Caught FileNotFoundException: "+e.getMessage());
        }catch (IOException e){
            System.out.println("Exception Caught IOException: "+e.getMessage());
        }
        return true;
    }
}

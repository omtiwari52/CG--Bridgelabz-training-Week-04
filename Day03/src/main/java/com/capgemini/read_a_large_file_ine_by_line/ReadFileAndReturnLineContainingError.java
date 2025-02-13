package com.capgemini.read_a_large_file_ine_by_line;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileAndReturnLineContainingError {

    //method to read file
    public static String readFile(String sourceFileName){
        //storing in file path
        String myFile = "src/main/java/com/capgemini/read_a_large_file_ine_by_line/" + sourceFileName;

        try (BufferedReader br = new BufferedReader(new FileReader(myFile))){
            String line; //line contains each line
            while((line = br.readLine()) != null ){
                if(line.toLowerCase().contains("error")){
                    return line;
                }
            }
        }
        catch (IOException e){     //Handling IO exception
            System.out.println("Source file does not exist.");
            System.out.println("Exception occurred "+ e.getMessage());
        }
        return null;
    }
}

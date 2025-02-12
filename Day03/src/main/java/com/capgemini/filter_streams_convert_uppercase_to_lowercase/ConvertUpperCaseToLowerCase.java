package com.capgemini.filter_streams_convert_uppercase_to_lowercase;

import java.io.*;

public class ConvertUpperCaseToLowerCase {

    //method to convert each word in source file to lowercase and then write it to destination file
    public static void readConvertAndWrite(String sourceFileName, String destinationFileName){
        //storing in file path
        String myFile = "src/main/java/com/capgemini/filter_streams_convert_uppercase_to_lowercase/" + sourceFileName;
        String myFile2 = "src/main/java/com/capgemini/filter_streams_convert_uppercase_to_lowercase/" + destinationFileName;

        try (BufferedReader br = new BufferedReader(new FileReader(myFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(myFile2))){
            String line; //line contains each line
            // Read each line from the input file
            while ((line = br.readLine()) != null) {
                // Convert the line to lowercase and write to output file
                writer.write(line.toLowerCase());
                writer.newLine();  // Write a newline after each line
            }
        }
        catch (IOException e){     //Handling IO exception
            System.out.println("Source file does not exist.");
            System.out.println("Exception occurred "+ e.getMessage());
        }
    }
}

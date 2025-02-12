package com.capgemini.file_handling_read_and_write_a_text_file;

import java.io.*;

public class ReadInputFileAndWriteDestination {

    //method to read file
    public static void readFile(String sourceFileName, String destinationFileName){
        //storing in file path
        String myFile = "src/main/java/com/capgemini/file_handling_read_and_write_a_text_file/" + sourceFileName;

        try (BufferedReader br = new BufferedReader(new FileReader(myFile))){
            String line; //line contains each line
            while((line = br.readLine()) != null ){
                writeFile(destinationFileName,line);
            }
        }
        catch (IOException e){     //Handling IO exception
            System.out.println("Source file does not exist.");
            System.out.println("Exception occurred "+ e.getMessage());
        }
    }

    //method to write in file
    public static void writeFile(String fileName, String content){
        String myFile = "src/main/java/file_handling_read_and_write_a_text_file/" + fileName;
        File file = new File(myFile);
        try {
            // Ensure the file exists
            if (!file.exists()) {
                file.getParentFile().mkdirs(); // Create directories if they do not exist
                file.createNewFile(); // Create the file
            }
            try (FileWriter newFile = new FileWriter(myFile,true)){
                newFile.write(content + "\n");
            }
        }
        catch (IOException e) {
            System.out.println("Exception caught "+e.getMessage());
        }
    }
}
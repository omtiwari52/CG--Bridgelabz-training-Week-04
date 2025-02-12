package com.capgemini.read_user_input_from_console;

import java.io.*;

public class ReadUserInputAndWrite {

    //method to write in file
    public static void writeFile(String fileName, String name, int age, String progLang){
        String myFile = "src/main/java/read_user_input_from_console/" + fileName;
        File file = new File(myFile);
        try {
            // Ensure the file exists
            if (!file.exists()) {
                file.getParentFile().mkdirs(); // Create directories if they do not exist
                file.createNewFile(); // Create the file
            }
            try (FileWriter newFile = new FileWriter(myFile,true)){
                newFile.write("Name: "+name + "\nAge: "+age +"\nProgramming Language: "+progLang);
            }
        }
        catch (IOException e) {
            System.out.println("Exception caught "+e.getMessage());
        }
    }
}
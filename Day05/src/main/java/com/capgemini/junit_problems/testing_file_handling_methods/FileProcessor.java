package com.capgemini.junit_problems.testing_file_handling_methods;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileProcessor {

    // Method to write content to a file
    public static void writeToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        }
    }

    // Method to read content from a file
    public static String readFromFile(String filename) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString().trim(); // Remove trailing newline
    }

    // Method to check if a file exists
    public static boolean fileExists(String filename) {
        return Files.exists(Paths.get(filename));
    }
}
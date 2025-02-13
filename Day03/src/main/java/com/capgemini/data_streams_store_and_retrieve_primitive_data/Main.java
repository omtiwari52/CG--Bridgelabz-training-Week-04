package com.capgemini.data_streams_store_and_retrieve_primitive_data;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/java/com/capgemini/data_streams_store_and_retrieve_primitive_data/student_data.txt";  // Binary file to store student data

        // Creating a sample student object
        Student student = new Student(101, "Om Tiwari", 4.75);

        // Writing student data to a binary file using DataOutputStream
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(student.rollNumber);
            dos.writeBytes(student.name);  // writeBytes writes the string directly without length prefix
            dos.writeByte(0);  // write a null byte to signify the end of the name string
            dos.writeDouble(student.gpa);
            System.out.println("Student data has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("An error occurred while writing data.");
        }

        // Reading student data from the binary file using DataInputStream
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            int rollNumber = dis.readInt();
            String name = readString(dis);  // Custom method to read the name string
            double gpa = dis.readDouble();

            // Displaying the retrieved student data
            System.out.println("Retrieved Student Data:");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("An error occurred while reading data.");
        }
    }

    // Custom method to read the string from the DataInputStream
    private static String readString(DataInputStream dis) throws IOException {
        StringBuilder sb = new StringBuilder();
        byte b;
        while ((b = dis.readByte()) != 0) {  // Read bytes until we encounter the null byte
            sb.append((char) b);
        }
        return sb.toString();
    }
}

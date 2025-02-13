package com.capgemini.buffered_streams_efficient_file_copy;

import java.io.*;

public class BufferedStreamsCopy {

    private static final int BUFFER_SIZE = 4096; // 4 KB

    // Method to copy file using Buffered Streams
    public static long copyWithBufferedStreams(String source, String destination) {
        long startTime = System.nanoTime();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error copying file with buffered streams: " + e.getMessage());
        }

        return System.nanoTime() - startTime;
    }

    // Method to copy file using Unbuffered Streams
    public static long copyWithUnbufferedStreams(String source, String destination) {
        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {


            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error copying file with unbuffered streams: " + e.getMessage());
        }

        return System.nanoTime() - startTime;
    }
}

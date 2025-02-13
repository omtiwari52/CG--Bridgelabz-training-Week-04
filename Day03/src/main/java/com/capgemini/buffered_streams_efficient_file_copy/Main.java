package com.capgemini.buffered_streams_efficient_file_copy;

public class Main {
    public static void main(String[] args) {
        String sourceFile = "src/main/java/com/capgemini/buffered_streams_efficient_file_copy/source_large_file.txt";  // Change to your file path
        String bufferedDestFile = "src/main/java/com/capgemini/buffered_streams_efficient_file_copy/buffered_copy.txt";
        String unbufferedDestFile = "src/main/java/com/capgemini/buffered_streams_efficient_file_copy/unbuffered_copy.txt";

        // Copy using buffered streams
        long bufferedTime = BufferedStreamsCopy.copyWithBufferedStreams(sourceFile, bufferedDestFile);
        System.out.println("Buffered Streams Execution Time: " + bufferedTime + " ns");

        // Copy using unbuffered streams
        long unbufferedTime = BufferedStreamsCopy.copyWithUnbufferedStreams(sourceFile, unbufferedDestFile);
        System.out.println("Unbuffered Streams Execution Time: " + unbufferedTime + " ns");

        // Compare the performance
        System.out.println("\nBuffered streams are " + (double) unbufferedTime / bufferedTime + " times faster than unbuffered streams.");
    }
}

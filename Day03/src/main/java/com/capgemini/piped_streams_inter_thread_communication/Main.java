package com.capgemini.piped_streams_inter_thread_communication;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            WriterThread writer = new WriterThread(pos);
            ReaderThread reader = new ReaderThread(pis);

            writer.start();
            reader.start();

            writer.join();
            reader.join();

            System.out.println("Received: " + reader.getResult());
        } catch (IOException | InterruptedException e) {
            System.err.println("Main IOException: " + e.getMessage());
        }
    }
}

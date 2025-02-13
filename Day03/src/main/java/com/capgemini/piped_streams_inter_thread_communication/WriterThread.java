package com.capgemini.piped_streams_inter_thread_communication;

import java.io.*;

public class WriterThread extends Thread{
    private PipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    public void run() {
        try {
            String message = "Hello from WriterThread!";
            pos.write(message.getBytes());
            pos.close(); // Close the stream after writing
        } catch (IOException e) {
            System.err.println("WriterThread IOException: " + e.getMessage());
        }
    }
}

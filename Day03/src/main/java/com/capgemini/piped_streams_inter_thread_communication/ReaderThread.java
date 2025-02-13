package com.capgemini.piped_streams_inter_thread_communication;

import java.io.*;

public class ReaderThread extends Thread{
    private PipedInputStream pis;
    private StringBuilder result = new StringBuilder();

    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    public void run() {
        try {
            int data;
            while ((data = pis.read()) != -1) {
                result.append((char) data);
            }
            pis.close(); // Close the stream after reading
        } catch (IOException e) {
            System.err.println("ReaderThread IOException: " + e.getMessage());
        }
    }
    public String getResult() {
        return result.toString();
    }
}

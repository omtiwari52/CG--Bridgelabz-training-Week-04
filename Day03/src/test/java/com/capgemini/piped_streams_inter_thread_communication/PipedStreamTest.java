package com.capgemini.piped_streams_inter_thread_communication;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PipedStreamTest {

    @Test
    void testPipedStreamCommunication() throws IOException, InterruptedException {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        WriterThread writer = new WriterThread(pos);
        ReaderThread reader = new ReaderThread(pis);

        writer.start();
        reader.start();

        writer.join();
        reader.join();

        assertEquals("Hello from WriterThread!", reader.getResult());
    }
}

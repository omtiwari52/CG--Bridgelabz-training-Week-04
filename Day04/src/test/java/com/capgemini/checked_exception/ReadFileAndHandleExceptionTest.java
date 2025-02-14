package com.capgemini.checked_exception;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReadFileAndHandleExceptionTest {


    @Test
    void readFileTest1() throws IOException {
        assertTrue(ReadFileAndHandleException.readFile("demo_file.txt"));
    }
}

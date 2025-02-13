package com.capgemini.read_a_large_file_ine_by_line;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadFileAndReturnLineContainingErrorTest {

    @Test
    void readFileAndReturnTest1(){

        String sourceFile = "demo_file.txt";
        assertEquals("Again this line also does not contain error keyword", ReadFileAndReturnLineContainingError.readFile(sourceFile));
    }
}

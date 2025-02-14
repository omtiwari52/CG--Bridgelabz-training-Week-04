package com.capgemini.try_with_resources;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReadFileTryWithResourcesTest {

    @Test
    void tryWithResourcesTest1(){
        assertThrows(IOException.class,()-> ReadFileTryWithResources.readFile("jfds"));
    }

    @Test
    void tryWithResourcesTest2() throws IOException {
        assertTrue(ReadFileTryWithResources.readFile("demo_file.txt"));
    }

}

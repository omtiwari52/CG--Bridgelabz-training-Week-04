package com.capgemini.junit_problems.testing_file_handling_methods;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileProcessorTest {

    private static final String TEST_FILE = "src/test/java/com/capgemini/junit_problems/testing_file_handling_methods/testfile.txt";
    private static final String TEST_CONTENT = "Hello, this is a test file!";

    @BeforeEach
    void setUp() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @AfterEach
    void tearDown() throws IOException {
        // Clean up test file after each test
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    void testWriteToFileAndReadFromFile() throws IOException {
        FileProcessor.writeToFile(TEST_FILE, TEST_CONTENT);
        String content = FileProcessor.readFromFile(TEST_FILE);
        assertEquals(TEST_CONTENT, content);
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        FileProcessor.writeToFile(TEST_FILE, TEST_CONTENT);
        assertTrue(FileProcessor.fileExists(TEST_FILE));
    }

    @Test
    void testReadFromFileThrowsIOExceptionForMissingFile() {
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("nonexistent.txt"));
    }
}

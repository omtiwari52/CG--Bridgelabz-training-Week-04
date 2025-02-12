package com.capgemini.file_handling_read_and_write_a_text_file;

import org.junit.jupiter.api.Test;

public class ReadInputFileAndWriteDestinationTest {

    @Test
    void readAndWriteFileTest1(){
        ReadInputFileAndWriteDestination.readFile("source_file.txt", "destination_file.txt");
    }
}

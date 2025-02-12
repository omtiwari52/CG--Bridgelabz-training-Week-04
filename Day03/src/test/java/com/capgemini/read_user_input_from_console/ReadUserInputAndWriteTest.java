package com.capgemini.read_user_input_from_console;

import org.junit.jupiter.api.Test;

public class ReadUserInputAndWriteTest {

    @Test
    void readUserInputAndWrite1(){
        ReadUserInputAndWrite.writeFile("source_file.txt", "Om", 21, "Java");
    }
}

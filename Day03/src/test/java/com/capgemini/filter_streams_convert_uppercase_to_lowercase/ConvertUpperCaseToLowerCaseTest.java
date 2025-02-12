package com.capgemini.filter_streams_convert_uppercase_to_lowercase;

import org.junit.jupiter.api.Test;

public class ConvertUpperCaseToLowerCaseTest {

    @Test
    void convertUpperToLowerTest1(){
        ConvertUpperCaseToLowerCase.readConvertAndWrite("src/main/java/com/capgemini/filter_streams_convert_uppercase_to_lowercase/source_file.txt","src/main/java/com/capgemini/filter_streams_convert_uppercase_to_lowercase/destinationFileName");
    }
}

package com.capgemini.regex_problems.censor_bad_words_in_a_sentence;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CensorBadWordsTest {


    ArrayList<String> badWords = new ArrayList<>(Arrays.asList("damn", "stupid"));

    @Test
    void sensorTest1(){
        assertEquals("This is a **** bad example with some **** words", CensorBadWords.sensor(badWords, "This is a damn bad example with some stupid words"));
    }


    @Test
    void sensorTest2(){
        assertEquals("This is a damn bad example with some stupid words", CensorBadWords.sensor(badWords, "This is a damn bad example with some stupid words"));
    }
}

package com.capgemini.regex.repeating_word_in_a_sentence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckRepeatWordsTest {
    @Test
    void checkRepeatWords(){
        String text = "This is is a repeated repeated word test";
        assertEquals("is",FindRepeatingWords.findRepeatingWords(text).get(0));
    }
}

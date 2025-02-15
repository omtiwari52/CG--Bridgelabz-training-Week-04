package com.capgemini.regex_problems.extract_programming_language_from_text;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtractingProgrammingLanguageTest {
    @Test
    void checkStringOne(){
        String text = "I love Java";
        assertEquals("Java",ExtractProgrammingLanguage.extractProgrammingLanguage(text));
    }
}

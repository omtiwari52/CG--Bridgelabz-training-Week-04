package com.capgemini.regex_problems.extract_all_capitalized_words_from_a_sentence;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtractCapitalWordTest {

    @Test
    void findCapitalTest1(){
        ArrayList<String> ans = new ArrayList<>(Arrays.asList("The", "Eiffel", "Tower", "Paris", "Statue", "Liberty", "New", "York"));
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York";
        assertEquals(ans, ExtractCapitalWord.findCapital(text));
    }
}

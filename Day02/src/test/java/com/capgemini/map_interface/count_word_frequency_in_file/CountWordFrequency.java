package com.capgemini.map_interface.count_word_frequency_in_file;

import com.capgemini.map_interface.count_words_in_file_and_map.MapWordsFrequency;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountWordFrequency {

    // Test to read file and count words
    @Test
    void testWordCount() {
        HashMap<String, Integer> result = MapWordsFrequency.countAndMap("demo.txt");

        // Expected word frequency
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("tiwari", 2);
        expected.put("om", 4);
        expected.put("hello", 2);

        assertEquals(expected, result);
    }

}

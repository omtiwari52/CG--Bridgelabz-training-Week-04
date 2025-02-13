package com.capgemini.count_words_in_a_file;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.LinkedHashMap;
import static org.junit.jupiter.api.Assertions.*;

class CountWordInAFileTest {

    @Test
    void testReadFileAndCount() {
        // Sample file path (Ensure test.txt exists in the specified directory with test content)
        String testFilePath = "demo_file.txt";

        // Call method
        HashMap<String, Integer> wordCount = CountWordInAFile.readFileAndCount(testFilePath);

        // Check if the word count map is not empty
        assertNotNull(wordCount);

        // Check for specific words if test.txt contains "hello world hello"
        assertEquals(7, wordCount.get("om"));
        assertEquals(4, wordCount.get("harsh"));
    }

    @Test
    void testSortHashMap() {
        // Create a hashmap for testing
        HashMap<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("om", 5);
        unsortedMap.put("harsh", 2);
        unsortedMap.put("durgesh", 8);

        // Call sorting method
        LinkedHashMap<String, Integer> sortedMap = CountWordInAFile.sortHashMap(unsortedMap);

        // Convert keys to an array
        String[] sortedKeys = sortedMap.keySet().toArray(new String[0]);

        // Verify order (Descending by value)
        assertEquals("durgesh", sortedKeys[0]);
        assertEquals("om", sortedKeys[1]);
        assertEquals("harsh", sortedKeys[2]);
    }
}

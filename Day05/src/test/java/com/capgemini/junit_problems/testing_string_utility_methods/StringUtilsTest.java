package com.capgemini.junit_problems.testing_string_utility_methods;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class StringUtilsTest {

    @Test
    void testReverse() {
        assertEquals("dcba", StringUtils.reverse("abcd"));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", StringUtils.toUpperCase("hello"));
    }
}

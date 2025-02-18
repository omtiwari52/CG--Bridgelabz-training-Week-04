package com.capgemini.annotations.suppress_unchecked_warnings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class supressArrayListWarningsTest {

    @SuppressWarnings("unchecked")
    @Test
    void testAddElements() {
        assertDoesNotThrow(supressArrayListWarnings::addElements);
        System.out.println("✅ Test1 Passed");
    }
}

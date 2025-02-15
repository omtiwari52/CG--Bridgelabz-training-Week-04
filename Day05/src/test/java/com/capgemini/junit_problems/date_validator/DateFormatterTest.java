package com.capgemini.junit_problems.date_validator;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {

    @Test
    void testValidDateFormats() {
        assertEquals("15-02-2024", DateFormatter.formatDate("2024-02-15"));
        assertEquals("01-01-2023", DateFormatter.formatDate("2023-01-01"));
    }

    @Test
    void testInvalidDateFormats() {
        assertEquals("Invalid date format", DateFormatter.formatDate("15-02-2024")); // Wrong format
        assertEquals("Invalid date format", DateFormatter.formatDate("2024/02/15")); // Slashes instead of dashes
        assertEquals("Invalid date format", DateFormatter.formatDate("abcd-ef-gh")); // Non-numeric input
        assertEquals("Invalid date format", DateFormatter.formatDate("")); // Empty string
    }
}

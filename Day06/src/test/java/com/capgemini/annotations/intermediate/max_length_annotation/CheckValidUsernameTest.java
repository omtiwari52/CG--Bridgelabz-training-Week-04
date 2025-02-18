package com.capgemini.annotations.intermediate.max_length_annotation;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CheckValidUsernameTest {
    @Test
    void checkValidUsername() {
        User validate = new User("Harshveer");
        assertEquals("Harshveer", validate.getUserName());
    }

    @Test
    void testInvalidUsernameLength() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new User("VeryLongUsername");
        });

        assertEquals("Exception caught", exception.getMessage());
    }

}

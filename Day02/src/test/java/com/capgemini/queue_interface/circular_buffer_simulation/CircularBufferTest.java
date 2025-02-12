package com.capgemini.queue_interface.circular_buffer_simulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircularBufferTest {
    private CircularBuffer buffer;

    @BeforeEach
    void setUp() {
        buffer = new CircularBuffer(3); // Initialize a buffer of size 3 before each test
    }

    @Test
    void testInsertionWithoutOverwrite() {
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);

        assertEquals(1, buffer.getBuffer()[0]);
    }

    @Test
    void testOverwriteOldestElement() {
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.insert(4); // Should overwrite 1

        assertEquals(4,buffer.getBuffer()[0]); // first value of the buffer should be 4 as the new element added tp the front
    }

}

package com.capgemini.queue_interface.reverse_queue;

import com.capgemini.queue_interface.reverse_queue.ReverseQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckReverseQueue {
    // check the reverse of the queue
    ReverseQueue reverse = new ReverseQueue();

    @Test
    void testOne(){
        assertEquals(Arrays.asList(4,3,2,1),reverse.reverseQueue(new LinkedList<>(Arrays.asList(1,2,3,4))));
    }

    @Test
    void testSecond(){
        assertEquals(Arrays.asList(4,3,2,1,2),reverse.reverseQueue(new LinkedList<>(Arrays.asList(1,2,4,3,2))));
    }
}

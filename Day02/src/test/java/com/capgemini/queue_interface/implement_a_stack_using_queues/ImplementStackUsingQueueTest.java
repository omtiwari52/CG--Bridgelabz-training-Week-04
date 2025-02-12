package com.capgemini.queue_interface.implement_a_stack_using_queues;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class ImplementStackUsingQueueTest {

    //custom stack
    ImplementStackFromQueue s = new ImplementStackFromQueue();

    //stack using collection
    Stack<Integer> s1 = new Stack<>();


    @Test
    void stackImplementedTest1(){
        s.push(1);
        s.push(2);
        s.push(3);
        s1.push(1);
        s1.push(2);
        s1.push(3);

        //check if both stack returns same peek element then test will pass
        assertEquals(s.peek(), s1.peek());

    }
}

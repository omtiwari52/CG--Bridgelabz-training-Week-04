package com.capgemini.list_interface.reverse_a_list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseArrayAndLinkedListTest {

    @Test
    void reverseArrayListTest(){
        assertEquals(Arrays.asList(5,4,3,2,1),ReverseArrayList.reverseArrayList(new ArrayList<>(Arrays.asList(1,2,3,4,5))));
        assertEquals(Arrays.asList(5,4,3,2,1),ReverseLinkedList.reverseLinkedList(new LinkedList<>(Arrays.asList(1,2,3,4,5))));

    }
     // Failed test case
    @Test
    void testSecond(){
        assertEquals(Arrays.asList(1,2,3,2,1),ReverseArrayList.reverseArrayList(new ArrayList<>(Arrays.asList(1,2,3,4,5))));
        assertEquals(Arrays.asList(5,1,3,2,1),ReverseLinkedList.reverseLinkedList(new LinkedList<>(Arrays.asList(1,2,3,4,5))));
    }
}

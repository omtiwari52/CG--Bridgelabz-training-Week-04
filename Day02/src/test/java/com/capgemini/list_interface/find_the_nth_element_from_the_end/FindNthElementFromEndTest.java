package com.capgemini.list_interface.find_the_nth_element_from_the_end;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class FindNthElementFromEndTest {
    LinkedList<Character> list = new LinkedList<>(Arrays.asList('A','B','C','D','E'));

    @Test
    void findNthElementTest1(){
        assertEquals('D', FindNthElementFromTheNode.findNthNode(list,2));
    }

    @Test
    void findNthElementTest2(){
        assertEquals('C', FindNthElementFromTheNode.findNthNode(list,2));
    }
}

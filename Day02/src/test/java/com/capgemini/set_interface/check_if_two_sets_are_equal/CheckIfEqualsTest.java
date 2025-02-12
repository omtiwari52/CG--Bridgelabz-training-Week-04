package com.capgemini.set_interface.check_if_two_sets_are_equal;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckIfEqualsTest {

    @Test
    void areEqualsTest1(){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
        assertEquals(set1, set2);
    }

    @Test
    void areEqualsTest2(){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 7, 1));
        assertEquals(set1, set2);
    }
}

package com.capgemini.set_interface.find_subsets;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfOneSetIsSubsetOfAnotherTest {

    HashSet<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
    HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,4));
    HashSet<Integer> set3 = new HashSet<>(Arrays.asList(2, 5));

    @Test
    void checkForSubsetTest1(){
        assertTrue(set2.containsAll(set1));
    }

    //below test is meant to fail
    @Test
    void checkForSubsetTest2(){
        assertTrue(set2.containsAll(set3));
    }
}

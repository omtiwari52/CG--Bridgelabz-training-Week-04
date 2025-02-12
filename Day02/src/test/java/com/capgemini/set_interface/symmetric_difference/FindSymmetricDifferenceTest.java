package com.capgemini.set_interface.symmetric_difference;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindSymmetricDifferenceTest {

    HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
    HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

    @Test
    void findSymmetricTest1(){
        assertEquals(new HashSet<>(Arrays.asList(1, 2, 4, 5)), FindSymmetricDifference.findDifference(set1, set2));
    }

    //below test case is meant to be fail
    @Test
    void findSymmetricTest2(){
        assertEquals(new HashSet<>(Arrays.asList(1, 2, 3, 5)), FindSymmetricDifference.findDifference(set1, set2));
    }
}

package com.capgemini.set_interface.union_and_intersection_of_two_sets;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UnionAndIntersectionOfTwoSetsTest {

    HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
    HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

    @Test
    void unionTest1(){
        assertEquals(new HashSet<>(Arrays.asList(1,2,3,4,5)), new HashSet<>(UnionAndIntersectionOfTwoSets.findUnion(set1,set2)));
    }

    @Test
    void intersectionTest1(){
        assertEquals(new HashSet<>(List.of(3)), new HashSet<>(UnionAndIntersectionOfTwoSets.findIntersection(set1,set2)));
    }

    //below testcases are meant to be fail
    @Test
    void unionTest2(){
        assertEquals(new HashSet<>(Arrays.asList(1,2,3,4)), new HashSet<>(UnionAndIntersectionOfTwoSets.findUnion(set1,set2)));
    }

    @Test
    void intersectionTest2(){
        assertEquals(new HashSet<>(List.of(4)), new HashSet<>(UnionAndIntersectionOfTwoSets.findIntersection(set1,set2)));
    }
}

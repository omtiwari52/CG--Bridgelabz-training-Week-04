package com.capgemini.set_interface.convert_a_set_to_a_sorted_list;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertSetToSortedListTest {

    //create a hashset
    HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(5,3,9,1));

    @Test
    void test1(){
        assertEquals(Arrays.asList(1,3,5,9), ConvertSetToSortedList.convertSortedList(hashSet));
    }

    //below test case is meant to be fail
    @Test
    void test2(){
        assertEquals(Arrays.asList(1,3,9,5), ConvertSetToSortedList.convertSortedList(hashSet));
    }
}

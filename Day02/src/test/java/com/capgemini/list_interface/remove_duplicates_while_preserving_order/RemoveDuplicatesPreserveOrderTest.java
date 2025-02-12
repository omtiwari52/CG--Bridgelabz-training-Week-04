package com.capgemini.list_interface.remove_duplicates_while_preserving_order;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesPreserveOrderTest {

    @Test
    void removeDuplicatesTest1(){
        assertEquals(Arrays.asList(3,1,2,4), RemoveDuplicatesPreserveOrder.removeDuplicates(new ArrayList<>(Arrays.asList(3,1,2,2,3,4))));
    }

    @Test
    void removeDuplicatesTest2(){
        assertEquals(Arrays.asList(3,2,1,4), RemoveDuplicatesPreserveOrder.removeDuplicates(new ArrayList<>(Arrays.asList(3,1,2,2,3,4))));
    }
}

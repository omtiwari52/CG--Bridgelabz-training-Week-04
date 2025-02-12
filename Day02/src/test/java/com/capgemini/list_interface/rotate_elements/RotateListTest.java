package com.capgemini.list_interface.rotate_elements;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.capgemini.list_interface.rotate_elements.RotateList.rotateList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateListTest {
    List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

    @Test
    void rotateTestOne() {
        assertEquals(Arrays.asList(30, 40, 50, 10, 20), rotateList(list, 2));
    }

    @Test
    void rotateTestSecond() {
        assertEquals(Arrays.asList(40, 50, 10, 20, 30), rotateList(list, 2));
    }

}
package com.capgemini.list_interface.rotate_elements;

import java.util.Collections;
import java.util.List;

public class RotateList {
    public static List<Integer> rotateList(List<Integer> list, int positions) {
        int size = list.size();

        // Handle cases where positions > size  -> like 5 times rotations perform but it is equal to the actual list
        positions = positions % size;

        if (positions == 0) return list; // No rotation needed

        // Reverse first part (0 to positions-1)
        Collections.reverse(list.subList(0, positions));

        // Reverse second part (positions to end)
        Collections.reverse(list.subList(positions, size));

        // Reverse the whole list
        Collections.reverse(list);

        return list;
    }
}
package com.capgemini.list_interface.rotate_elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.capgemini.list_interface.rotate_elements.RotateList.rotateList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int position = 2;

        System.out.println("Original List: " + list);
        List<Integer> rotatedList = rotateList(list, position);
        System.out.println("Rotated List: " + rotatedList);
    }
}


package com.capgemini.list_interface.remove_duplicates_while_preserving_order;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,1,2,2,3,4));

        System.out.println(new ArrayList<>(RemoveDuplicatesPreserveOrder.removeDuplicates(arr)));
    }
}

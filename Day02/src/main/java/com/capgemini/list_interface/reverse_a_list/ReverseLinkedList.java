package com.capgemini.list_interface.reverse_a_list;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

    //method to reverse a linkedlist
    public static List<Integer> reverseLinkedList(LinkedList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        //use while loop to iterate over the arraylist
        while (left < right) {
            //swap elements
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
        return list;
    }
}

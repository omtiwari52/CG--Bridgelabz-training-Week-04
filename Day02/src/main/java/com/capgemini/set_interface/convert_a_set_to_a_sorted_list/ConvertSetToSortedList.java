package com.capgemini.set_interface.convert_a_set_to_a_sorted_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ConvertSetToSortedList {

    //method to convert set into a sorted list
    public static List<Integer> convertSortedList(HashSet<Integer> hashSet){

        //create an arrayList to store elements and store hashset elements to arraylist
        ArrayList<Integer> ans = new ArrayList<>(hashSet);

        //use built-in method to sort list
        Collections.sort(ans);

        //return sorted list
        return ans;
    }
}

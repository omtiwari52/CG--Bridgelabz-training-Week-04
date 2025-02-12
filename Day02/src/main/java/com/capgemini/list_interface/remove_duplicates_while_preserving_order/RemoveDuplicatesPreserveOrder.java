package com.capgemini.list_interface.remove_duplicates_while_preserving_order;

import java.util.*;

public class RemoveDuplicatesPreserveOrder {

    public static List<Integer> removeDuplicates(ArrayList<Integer> arr){

        for(int i = 0; i < arr.size(); i++){
            for(int j = i+1; j < arr.size();){
                if(arr.get(i).equals(arr.get(j))){
                    arr.remove(j);
                }
                else{
                    j++;
                }
            }
        }
        return arr;
    }
}

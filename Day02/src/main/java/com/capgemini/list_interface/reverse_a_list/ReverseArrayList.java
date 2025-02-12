package com.capgemini.list_interface.reverse_a_list;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {

    //method to reverse arraylist
    public static List<Integer> reverseArrayList(ArrayList<Integer> arr){

        //print list before reversing
        System.out.print("Your list before reversal is: [");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println("]");

        //initialize variable left and right to keep track of index while using two pointer
        int left = 0;
        int right = arr.size()-1;

        //use while loop to iterate over the arraylist
        while(left < right){
            //swap elements
            int temp = arr.get(left);
            arr.set(left,arr.get(right));
            arr.set(right, temp);

            left++;
            right--;
        }
        System.out.println();
        System.out.print("Your reversed list is: [");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println("]");
        return arr;
    }
}

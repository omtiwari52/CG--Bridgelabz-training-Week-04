package com.capgemini.multiple_catch_blocks;

public class ArrayOperations {

    //method which takes an array and an index and return the value corresponding to that index
    public static boolean findValueAtIndex(int[] arr, int index){
        // Method to retrieve the value
        if (arr.length > 0) {
            System.out.println("value at index " + index +" is "  + arr[index]);
            return true;
        }
        return false;
    }
}


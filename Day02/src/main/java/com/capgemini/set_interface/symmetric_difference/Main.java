package com.capgemini.set_interface.symmetric_difference;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        //create 2 set
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println("Your symmetric difference of set are: "+ FindSymmetricDifference.findDifference(set1,set2));
    }
}

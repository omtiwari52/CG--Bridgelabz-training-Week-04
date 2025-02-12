package com.capgemini.set_interface.find_subsets;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,4));

        System.out.println(CheckIfOneSetIsSubsetOfAnother.checkIfSubset(set1,set2));
    }
}

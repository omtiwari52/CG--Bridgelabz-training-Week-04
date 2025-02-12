package com.capgemini.set_interface.union_and_intersection_of_two_sets;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println("Union of two sets are: "+UnionAndIntersectionOfTwoSets.findUnion(set1, set2));
        System.out.println("Intersection of two sets are: "+UnionAndIntersectionOfTwoSets.findIntersection(set1, set2));
    }
}

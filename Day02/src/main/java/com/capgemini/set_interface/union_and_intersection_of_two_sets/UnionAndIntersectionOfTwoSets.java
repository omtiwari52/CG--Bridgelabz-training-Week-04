package com.capgemini.set_interface.union_and_intersection_of_two_sets;

import java.util.HashSet;

public class UnionAndIntersectionOfTwoSets {

    //method to find union of two sets
    public static HashSet<Integer> findUnion(HashSet<Integer> set1, HashSet<Integer> set2){

        //create a new ans HashSet to store union of two sets
        HashSet<Integer> ans = new HashSet<>();

        //add all element of set 1 and set2 in ans set to find union we are using ans set to avoid duplicates
        ans.addAll(set1);
        ans.addAll(set2);

        //return ans
        return ans;
    }

    //method to find union of two sets
    public static HashSet<Integer> findIntersection(HashSet<Integer> set1, HashSet<Integer> set2){

        //create a new ans HashSet to store union of two sets
        HashSet<Integer> ans = new HashSet<>();

        //iterate over both the sets and find intersection and add it to the ans HashSet
        for(int i : set2){
            if(set1.contains(i)){
                ans.add(i);
            }
        }
        //return ans
        return ans;
    }
}

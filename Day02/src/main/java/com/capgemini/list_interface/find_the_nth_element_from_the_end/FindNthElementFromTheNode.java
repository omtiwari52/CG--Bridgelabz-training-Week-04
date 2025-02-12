package com.capgemini.list_interface.find_the_nth_element_from_the_end;

import java.util.*;

public class FindNthElementFromTheNode {

    //method to find Nth node of a linked list from last
    public static char findNthNode(LinkedList<Character> list, int n){

        if(list == null || n < 0){
            throw new IllegalArgumentException("Invalid Input");
        }

        Iterator<Character> first = list.listIterator();
        Iterator<Character> second = list.listIterator();
        for(int i = 0; i < n; i++){
            if(!first.hasNext()){
                throw new IllegalArgumentException("Index out of bound");
            }
            first.next();
        }

        while(first.hasNext()){
            first.next();
            second.next();
        }

        return second.next();
    }
}

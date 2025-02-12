package com.capgemini.list_interface.find_the_nth_element_from_the_end;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>(Arrays.asList('A','B','C','D','E'));
        System.out.println(FindNthElementFromTheNode.findNthNode(list, 2));
    }
}

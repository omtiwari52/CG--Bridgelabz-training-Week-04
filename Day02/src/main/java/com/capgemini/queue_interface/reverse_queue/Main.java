package com.capgemini.queue_interface.reverse_queue;


import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ReverseQueue reverse = new ReverseQueue();
        System.out.println(reverse.reverseQueue(new LinkedList<>(Arrays.asList(1,2,3,4))));
    }
}

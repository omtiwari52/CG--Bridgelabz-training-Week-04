package com.capgemini.queue_interface.hospital_triage_system;

import java.util.PriorityQueue;

public class DisplayClass {
    // Method to display the patients
    public static void display(PriorityQueue<Patient> queue){
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}

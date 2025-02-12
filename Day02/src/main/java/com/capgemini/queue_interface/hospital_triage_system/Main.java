package com.capgemini.queue_interface.hospital_triage_system;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Patient> triage = new PriorityQueue<>((p1,p2)-> p2.severity - p1.severity);

        // Add the patients to the hospital
        triage.add(new Patient("Harsh veer singh" , 5));
        triage.add(new Patient("Om tiwari" , 2));
        triage.add(new Patient("Durgesh" , 4));
        triage.add(new Patient("Vipin sahu" , 3));

        // Display the queue
        DisplayClass.display(triage);
    }
}

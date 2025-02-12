package com.capgemini.queue_interface.hospital_triage_system;

import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospitalTriageSystemTest {
    PriorityQueue<Patient> pq = new PriorityQueue<>((p1, p2) -> p2.severity - p1.severity);

    @Test
    void testPatientWithHigherpriority(){
        pq.add(new Patient("Harshveer",5));
        pq.add(new Patient("Durgesh",1));
        pq.add(new Patient("Vipin",0));
        pq.add(new Patient("Om",3));
        assertEquals("Harshveer",pq.poll().name);
    }

    // Test case failed bcs of incorrect expect value
    @Test
    void testPatientWithHigherPrioritySecond(){
        assertEquals("Vipin",pq.poll().name);
    }

}

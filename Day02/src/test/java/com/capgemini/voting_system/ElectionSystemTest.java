package com.capgemini.voting_system;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectionSystemTest {

    ElectionSystem electionSystem = new ElectionSystem();

    @Test
    void testVoteCounting() {
        electionSystem.vote("Om");
        electionSystem.vote("Harshveer");
        electionSystem.vote("Om");

        // Check the votes in HashMap
        Map<String, Integer> expectedVotes = new HashMap<>();
        expectedVotes.put("Om", 2);
        expectedVotes.put("Harshveer", 1);

        assertEquals(2, expectedVotes.get("Om"));
        assertEquals(1, expectedVotes.get("Harshveer"));
    }
}

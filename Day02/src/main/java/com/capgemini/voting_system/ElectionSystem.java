package com.capgemini.voting_system;

import java.util.*;

public class ElectionSystem {

    private HashMap<String, Integer> voteMap;

    //TreeMap is used to display the results in sorted order
    private TreeMap<Integer, List<String>> sortedResults;

    //LinkedHashMap is used to maintain the order of votes.
    private LinkedHashMap<String, Integer> orderedVotes;

    public ElectionSystem(){
        voteMap = new HashMap<>();
        sortedResults = new TreeMap<>(Collections.reverseOrder()); // Highest votes first
        orderedVotes = new LinkedHashMap<>();
    }

    public void vote(String candidate){

        //update votes in a hashmap with candidate
        int votes = voteMap.getOrDefault(candidate,0)+1;
        voteMap.put(candidate,votes);

        // Remove old entry from TreeMap
        sortedResults.values().forEach(list -> list.remove(candidate));
        sortedResults.entrySet().removeIf(entry -> entry.getValue().isEmpty());

        // Add updated entry to TreeMap
        sortedResults.computeIfAbsent(votes, k -> new ArrayList<>()).add(candidate);

        // Maintain voting order
        orderedVotes.put(candidate, votes);
    }

    // Display sorted results (highest votes first)
    public void displayResults() {
        System.out.println("Election Results (Sorted by Votes):");
        for (var entry : sortedResults.entrySet()) {
            for (String candidate : entry.getValue()) {
                System.out.println(candidate + " -> " + entry.getKey() + " votes");
            }
        }
    }

    // Display votes in order of voting
    public void displayVotingOrder() {
        System.out.println("Voting Order:");
        for (var entry : orderedVotes.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }
    }
}

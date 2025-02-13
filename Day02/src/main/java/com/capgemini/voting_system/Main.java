package com.capgemini.voting_system;

public class Main {
    public static void main(String[] args) {
        ElectionSystem election = new ElectionSystem();
        election.vote("Om");
        election.vote("HarshVeer");
        election.vote("Durgesh");
        election.vote("Om");
        election.vote("Durgesh");
        election.vote("Om");

        election.displayResults();
        System.out.println("-----------------------------------------------------");
        election.displayVotingOrder();
    }
}

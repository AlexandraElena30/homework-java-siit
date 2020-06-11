package com.siit.homeworks.homework10.vote;

public class Candidates {

    private String lastName, firstName;
    private int votes;

    public Candidates(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.votes = 0;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }
    public void incrementVotes() {
        this.votes ++;
    }
}

package com.siit.homeworks.homework10.vote;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Persons {
    private List<IdentityCard> votersDatabase = new ArrayList<>();
    private List<Candidates> candidatesList = new ArrayList<>();

    public static void main(String[] args) {

        Persons votingMachine = new Persons();
        votingMachine.votersDatabase.add(new IdentityCard("Georgescu", "Mihail", " - ", "2343224521", "AS", 233));
        votingMachine.votersDatabase.add(new IdentityCard("Georgescu", "Mihail", " - ", "1232357889", "AS", 233));
        votingMachine.votersDatabase.add(new IdentityCard("Andreescu", "Elena", " - ", "6679733422", "AS", 233));
        votingMachine.votersDatabase.add(new IdentityCard("Popa", "Ion", " - ", "3599812213", "AS", 233));
        votingMachine.votersDatabase.add(new IdentityCard("Popescu", "Alina", " - ", "3324523241", "AS", 233));
        votingMachine.votersDatabase.add(new IdentityCard("Ionescu", "Gabriela", " - ", "5665223111", "AS", 233));
        votingMachine.votersDatabase.add(new IdentityCard("Ciobanu", "Andrei", " - ", "1013448909", "AS", 233));
        votingMachine.votersDatabase.add(new IdentityCard("Anton", "Dimitrie", " - ", "2276112906", "AS", 233));
        votingMachine.votersDatabase.add(new IdentityCard("Cristea", "Denis", " - ", "1129855645", "AS", 233));
        votingMachine.votersDatabase.add(new IdentityCard("Predel", "Sergiu", " - ", "2345834222", "AS", 233));


        votingMachine.candidatesList.add(new Candidates("Iliescu", "Gheorghe"));
        votingMachine.candidatesList.add(new Candidates("Cristescu", "Cristi"));
        votingMachine.candidatesList.add(new Candidates("Barbu", "Traian"));


        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        String[] arrOfStr;
        String input;
        while (!exit) {
            input = scanner.nextLine();
            arrOfStr = input.split("\\s+");
            if(arrOfStr[0].equals("exit"))
                exit=true;
            else if(arrOfStr[0].equals("print"))
                votingMachine.printVotes();
            else if(arrOfStr.length==3)
                votingMachine.addVote(arrOfStr[0],arrOfStr[1],arrOfStr[2]);
            else
                System.out.println("Invalid input");
        }

    }

    public void addVote(String CNP, String lastName, String firstName) {
        for (IdentityCard card : this.votersDatabase) {
            if (card.getCNP().equals(CNP) && card.isVoted()==false) {
                for (Candidates candidates : this.candidatesList) {
                    if (candidates.getLastName().equals(lastName) && candidates.getFirstName().equals(firstName)) {
                        candidates.incrementVotes();
                        card.setVoted(true);
                        System.out.println("Vote added successfully");
                        return;
                    }
                }
                System.out.println("Candidate's name was invalid!");
                return;
            }
        }
        System.out.println("CNP is not in voters' database or you have already voted");
    }

    public void printVotes() {

        Iterator<Candidates> iter = this.candidatesList.iterator();
        System.out.println("The current votes: ");
        Candidates temp;
        while (iter.hasNext()) {
            temp = iter.next();
            System.out.println(temp.getLastName() + " " + temp.getFirstName() + " " + temp.getVotes());
        }
    }
}

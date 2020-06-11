package com.siit.homeworks.homework02;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {

        System.out.print("Enter month number: ");
        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();

        if (monthNumber == 1) {
            System.out.println("January has 31 days");
        } else if (monthNumber == 2) {
            System.out.println("February has 29 days");
        } else if (monthNumber == 3) {
            System.out.println("March has 31 days");
        } else if (monthNumber == 4) {
            System.out.println("April has 30 days");
        } else if (monthNumber == 5) {
            System.out.println("May has 31 days");
        } else if (monthNumber == 6) {
            System.out.println("June has 30 days");
        } else if (monthNumber == 7) {
            System.out.println("July has 31 days");
        } else if (monthNumber == 8) {
            System.out.println("August has 31 days");
        } else if (monthNumber == 9) {
            System.out.println("September has 30 days");
        } else if (monthNumber == 10) {
            System.out.println("October has 31 days");
        } else if (monthNumber == 11) {
            System.out.println("November has 30 days");
        } else if (monthNumber == 12) {
            System.out.println("December has 31 days");
        } else {
            System.out.println("Invalid month.");

        }
    }
}

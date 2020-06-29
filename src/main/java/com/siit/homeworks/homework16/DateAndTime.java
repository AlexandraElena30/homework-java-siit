package com.siit.homeworks.homework16;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class DateAndTime {

    public static void main(String[] args) {
        DateAndTime d = new DateAndTime();
        System.out.println("\nThe length of each month in the current year: ");
        d.eachMonth(2020);
        System.out.println("\nLists all of the Mondays in that month:");
        d.allMondays();
        System.out.println("\nThis is the given date that occurs on Friday the 13th:");
        d.friday13(11, 2020);
    }

    // 2. Write a method that, for a given year, reports the length of each month within that year.
    public void eachMonth(int year) {
        YearMonth ym;
        for (int i = 1; i <= 12; i++) {
            ym = YearMonth.of(year, i);
            System.out.println(ym.lengthOfMonth() + " " + ym.getMonth().toString());
        }
    }

    // 3. Write a method that, for a given month of the current year, lists all of the Mondays in that month.
    public void allMondays() {
        Month month = Month.valueOf("July".toUpperCase());
        LocalDate date = Year.now().atMonth(month).atDay(1).
                with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        Month mi = date.getMonth();
        while (mi == month) {
            System.out.printf("%s%n", date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            mi = date.getMonth();
        }
    }

    // 4. Write an example that tests whether a given date occurs on Friday the 13th.
    public void friday13(int month, int year) {
        LocalDate ld = LocalDate.of(year, month, 13);
        if (ld.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
            System.out.println("It is Friday 13th.");
        } else {
            System.out.println("It's not Friday 13th.");
        }
    }
}

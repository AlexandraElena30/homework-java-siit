package com.siit.homeworks.homework03;

import java.util.Scanner;

class MaxDigitFromNumber {


    static void Digits(int number) {
        int max = 0;
        int min = 9;

        while (number != 0) {
            int r = number % 10;
            max = Math.max(r, max);
            min = Math.min(r, min);

            number = number / 10;
        }
        System.out.println(" " + max);
    }

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        System.out.println("The max digit from " + n + " is: ");
        Digits(n);

    }
}

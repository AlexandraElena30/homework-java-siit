package com.siit.homeworks.homework03;
import java.util.Scanner;

public class NumberFactorial {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        System.out.print("Factorial of the " + num + " is " + factorial(num));
    }

    static int factorial(int num) {
        int i;
        int fact = 1;
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;

    }
}

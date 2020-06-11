package com.siit.homeworks.homework02;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" x = ");
        int x = scanner.nextInt();
        System.out.println(" insert the sign(+,-,*,/,%): ");
        char  sign = scanner.next().charAt(0);
        System.out.println(" y = ");
        int y = scanner.nextInt();

        System.out.print("The results for : "+ x + " " + sign + " " + x + " = ");

        if( sign =='+'){
            System.out.print(x + y);
        } else  if( sign =='-') {
            System.out.print(x - y);
        } else if( sign =='*') {
            System.out.print(x * y);
        } else  if( sign =='/') {
            System.out.print(x / y);
        } else  if( sign =='%') {
            System.out.print(x % y);
        } else {
            System.out.println("Incorrect sign! ");
        }

    }
}

package com.siit.homeworks.homework03;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int firstNumber;
            int secondNumber;

            System.out.println("Write a number");
            firstNumber = Integer.parseInt(scanner.nextLine());

            System.out.println("Write another number");
            secondNumber = Integer.parseInt(scanner.nextLine());

            Addition(firstNumber, secondNumber);
            Substratcion(firstNumber, secondNumber);
            Multiplication(firstNumber, secondNumber);
            Division(firstNumber,secondNumber);

        }

        static void Addition( int firstNumber, int secondNumber ) {
            System.out.println("Addition = " + (firstNumber + secondNumber));
        }


        static void Substratcion( int firstNumber, int secondNumber ) {
            System.out.println("Substraction = " + (firstNumber - secondNumber));
        }


        static void Multiplication( int firstNumber, int secondNumber ) {
        System.out.println("Multiplication = " + (firstNumber * secondNumber));
        }

        static void Division( int firstNumber, int secondNumber ) {
        System.out.println("Division = " + (firstNumber / secondNumber));
        }

    }


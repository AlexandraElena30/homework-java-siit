package com.siit.homeworks.homework03;
import java.util.Scanner;

public class PrimeNumbersThanX {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("All the prime numbers lower than " + number + " are : " );
        printPrime(number);
    }

        static boolean isPrime(int n)
        {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i < n; i++){
                if (n % i == 0){
                    return false;
                }
            }
            return true;
        }


        static void printPrime(int n)
        {
            for (int i = 2; i <= n; i++)
            {
                if (isPrime(i))
                    System.out.print(i + " ");
            }
        }


}


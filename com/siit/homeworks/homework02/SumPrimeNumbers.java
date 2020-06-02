package com.siit.homeworks.homework02;

public class SumPrimeNumbers {

    public static void main(String[] args) {

        int i;
        int count;
        int sumOfNumbers = 0;
        int number = 1;

        while(number <= 100)
        {
            count = 0;
            i = 2;
            while(i <= number/2 )
            {
                if(number % i == 0)
                {
                    count++;
                    break;
                }
                i++;
            }
            if(count == 0 && number != 1 )
            {
                sumOfNumbers = number + sumOfNumbers;
            }
            number++;
        }
        System.out.println("The sum of first 100 prime numbers is: " + sumOfNumbers);


    }
}

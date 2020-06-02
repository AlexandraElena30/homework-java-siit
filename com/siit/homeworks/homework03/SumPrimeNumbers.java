package com.siit.homeworks.homework03;

public class SumPrimeNumbers {
    public static void main(String[] args)
    {
        int sum = 1;
        int x = 0;
        int num = 0;

        while (x < 100) {
            num++;
            if (num % 2 != 0) {

                if (is_Prime(num)) {
                    sum += num;
                }
            }
            x++;
        }
        System.out.println("Sum of the 100 prime numbers is : "+ sum);
    }

    public static boolean is_Prime(int n) {
        for (int i = 3; i * i <= n; i+= 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

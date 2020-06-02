package com.siit.homeworks.homework03;
import java.util.Scanner;

public class PalindromNumbers {
    public static void main(String... arg)
    {
        int number,check, x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number that you want to check: ");
        number = scanner.nextInt();
        check = number;
        x = palindromeOrNot(number);
        if( x == check)
            System.out.println( check +" = is a palindrome number! ");
        else
            System.out.println( check +" = is not a palindrome number! ");
    }
    static int  palindromeOrNot(int num )
    {
        int sum = 0;
        int repeat;

        while(num != 0)
        {
            repeat = num % 10;
            sum = ( sum * 10 ) + repeat;
            num /= 10;
        }
        return sum;
    }
}

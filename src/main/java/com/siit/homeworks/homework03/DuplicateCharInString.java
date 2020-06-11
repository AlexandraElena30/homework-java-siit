package com.siit.homeworks.homework03;

import java.util.Scanner;

public class DuplicateCharInString {

    public static String noDuplicates(String s) {

        StringBuilder str = new StringBuilder();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (str.toString().indexOf(c) < 0) {
                str.append(c);
            }
        }
        return str.toString();
    }

    public static boolean checkPalindrome(String A, String B) {
        int length = A.length();
        for (int i = length - 1; i >= 0; i--)
            B = B + A.charAt(i);

        if (A.equals(B)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        return A.equals(B);
    }



    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: " );
        String s = scanner.next();

        System.out.println(noDuplicates(s));
    }
}

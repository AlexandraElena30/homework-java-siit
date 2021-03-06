package com.siit.homeworks.homework05.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Strings_Manipulation {

    // Write a method to check if a string contains only digits.
    public static void checkDigits(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("The string is not made of digits");
            return;
        }
        System.out.println("The string is made of digits");

    }

    // Write a method to remove a given character from String.
    public static void removeChar(String s, char c) {
        String newString = s.replace(Character.toString(c), "");
        System.out.println("The new string is " + newString);


    }

    // Write a method to count a number of vowels and consonants in a given string.
    static boolean isVowel(char character) {
        character = Character.toUpperCase(character);
        return (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U');
    }

    static int countVowels(String strV) {
        int count = 0;
        for (int i = 0; i < strV.length(); i++)
            if (isVowel(strV.charAt(i)))
                ++count;
        return count;
    }

    static boolean isConson(char character) {
        character = Character.toUpperCase(character);

        return !(character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') &&
                character >= 65 && character <= 90;
    }

    static int countConson(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++)

            if (isConson(str.charAt(i)))
                ++count;
        return count;
    }

    // Write a method to count the occurrence of a given character in a string
    public static int count(String s, char c) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                res++;
            }
        }
        return res;
    }

    //Write a method to check if a given string is a palindrome.
    public static void checkPalindrome(String A, String B) {
        int length = A.length();
        for (int i = length - 1; i >= 0; i--)
            B = B + A.charAt(i);

        if (A.equals(B)) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string isn't palindrome");
        }
    }


    //Write a method to remove the duplicate character from String.
    public static String removeDuplicates(char str[], int number) {
        int index = 0;
        for (int i = 0; i < number; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }

            if (j == i) {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }

    // Write a method to find duplicate characters in a given string.
    public static void duplicateString(String str) {
        int count = 0;
        char[] inp = str.toCharArray();
        int[] checked = new int[inp.length];
        System.out.println("Duplicate Characters are:");
        for (int i = 0; i < str.length(); i++) {
            if (checked[i] != -1) {
                count = 0;
                for (int j = i + 1; j < str.length(); j++) {
                    if (inp[i] == inp[j]) {
                        //System.out.println(inp[j]);
                        count++;
                        checked[j] = -1;
                    }
                }
                if (count > 0)
                    System.out.println(inp[i]);
            }
        }
    }

    // Write a method to check if two strings are anagrams of each other.
    public static void anagrams(String string1, String string2) {
        char[] s1 = string1.toCharArray();
        char[] s2 = string2.toCharArray();

        if(string1=="" || string2=="") {
            System.out.println("One or both strings are empty");
            return;
        }
        class charFreq {
            public char c;
            public int count;

            public charFreq(char s) {
                this.c = s;
                this.count = 1;

            }

        }
        ArrayList<charFreq> list = new ArrayList<charFreq>();
        //String1 - add to list
        charFreq temp;int ok=0;
        for (char aux : s1) {
            ok=0;
            if (list.isEmpty() == true) {
                list.add(new charFreq(aux));
                ok=1;
            }else {
                for (charFreq listIterator : list)
                    if (listIterator.c == aux){
                        ok=1;
                        listIterator.count++;
                        break;
                    }
            }
            if(ok==0) {
                list.add(new charFreq(aux));
                //System.out.println("Added " + aux);
            }
        }



        //String2 - decrement count from list
        for (char aux : s2) {
            ok=0;

            for (charFreq listIterator : list)
                if (listIterator.c == aux){
                    ok=1;
                    listIterator.count--;

                }
            if (ok == 0) {

                System.out.println("The two strings:" + string1 + " " + string2 + " are not anagrams");
                return;
            }

        }

        for (charFreq listIterator : list) {
            //System.out.println(listIterator.c + " " + listIterator.count);
            if (listIterator.count != 0) {

                System.out.println("The two strings:" + string1 + " " + string2 + " are not anagrams");
                return;
            }
        }
        System.out.println("The two strings:" + string1 + " " + string2 + " are anagrams");


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Insert the string: ");
        String str = scanner.next();

        System.out.println("In the string are " + countVowels(str) + " vowels and  " + countConson(str) + " consonants");

        System.out.println("Enter what character to check occurrences ");
        char c = scanner.next().charAt(0);
        System.out.println("The occurrences are : " + count(str, c));
        String check = scanner.nextLine();
        checkPalindrome(str, check);
        checkDigits(str);
        removeChar(str, c);
        int n = str.length();
        System.out.println(removeDuplicates(str.toCharArray(), n));
        duplicateString(str);
        anagrams("listlen","silelnt");
        anagrams("","");


    }
}

//System.out.println("Enter the string to remove duplicates: ");
//char str1[] = scanner.nextLine().toCharArray();
// nu mai e nevoie momentan de ele

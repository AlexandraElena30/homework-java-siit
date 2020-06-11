package com.siit.homeworks.homework02;

import java.util.Scanner;

public class SmallestNumberFromArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");

        int length = scanner.nextInt();
        int[] Array = new int[length];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < length; i++) {
            Array[i] = scanner.nextInt();
        }

        int temp, size;
        size = Array.length;

        for(int i = 0; i < size; i++ ) {
            for (int j = i + 1; j < size; j++) {
                if (Array[i] > Array[j]) {
                    temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
            }
        }
        System.out.println("Smallest element of the array is:: "+ Array[0]);
    }

}








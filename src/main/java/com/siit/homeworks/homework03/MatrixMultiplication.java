package com.siit.homeworks.homework03;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String... args)
    {
        int row1, column1, row2, column2;
        int total = 0, a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of rows and columns of first matrix: ");
        row1 = sc.nextInt();
        column1 = sc.nextInt();
        int[][] firstMatrix = new int[row1][column1];
        System.out.println("Please enter elements of first matrix: ");
        for(a = 0; a < row1; a++)
        {
            for(b = 0; b < column1; b++)
            {
                firstMatrix[a][b] = sc.nextInt();
            }
        }
        System.out.println("Please enter number of rows and columns of second matrix: ");
        row2 = sc.nextInt();
        column2 = sc.nextInt();
        if(column1 != row2)
            System.out.println("Matrices can't be multiplied");
        else
        {
            int[][] secondMatrix = new int[row2][column2];
            int[][] multiply = new int[row1][column2];
            System.out.println("Please enter elements of second matrix: ");
            for(a = 0; a < row2; a++)
                for(b = 0; b < column2; b++)
                    secondMatrix[a][b] = sc.nextInt();
            for(a = 0; a < row1; a++)
            {
                for(b = 0; b < column2; b++)
                {
                    for(c = 0; c < row2; c++)
                        total = total + firstMatrix[a][c] * secondMatrix[c][b];
                    multiply[a][b] = total;
                    total = 0;
                }
            }
            System.out.println("Matrix multiplication: ");
            for(a = 0; a < row1; a++)
            {
                for(b = 0; b < column2; b++)
                    System.out.print(multiply[a][b] + "\t");
                System.out.print("\n");
            }
        }
        sc.close();
    }
}

package com.siit.homeworks.homework03;

public class ArrayIsSquare {

    public static void main(String... args) {
        int[][] m = {
                {4, 4, 3},
                {5, 7, 4},
                {7, 8, 9}
        };

        ArrayIsSquare.checkSquareMatrix(m);
    }

    public static void checkSquareMatrix(int[][] m) {
        int matrixLength = m.length;
        if (matrixLength == 0) {
            System.out.println("The matrix is not square");
        }
        boolean isSquare = true;
        for (int i = 0; i <= matrixLength - 1; i++) {
            if (m[i].length != matrixLength) {
                isSquare = false;
                break;
            }
        }
        if (isSquare) {
            System.out.println("The matrix is square");
        } else {
            System.out.println("The matrix is not square");
        }
    }
}

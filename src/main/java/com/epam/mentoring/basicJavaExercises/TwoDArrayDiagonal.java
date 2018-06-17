package com.epam.mentoring.basicJavaExercises;

import java.util.Arrays;

public class TwoDArrayDiagonal {

//    Write an application that generates a random two dimensional array of size N x N containing integers,
//    prints it, and sums the numbers under the main diagonal!

    public int countUnderDiagonal(int n) {
        int count = 0;
        int[][] twoDArray = create2DArrayWithRandomNumbers(n);
        displayMatrix(twoDArray);
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j <= i - 1; j++) {
                count += twoDArray[i][j];
            }
        }
        return count;


    }

    public static int[][] create2DArrayWithRandomNumbers(int n) {
        int[][] twoDArray = new int[n][n];
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = (int) (Math.random() * 100);
            }
        }
        return twoDArray;
    }

    public static void displayMatrix(int[][] nums2d) {
        System.out.println(Arrays.deepToString(nums2d).replaceAll("], ", "\n"));
    }
}

package com.epam.mentoring.basicJavaExercises;

import static com.epam.mentoring.basicJavaExercises.TwoDArrayDiagonal.create2DArrayWithRandomNumbers;
import static com.epam.mentoring.basicJavaExercises.TwoDArrayDiagonal.displayMatrix;

public class SameElement {

    // Write an application that generates a random two dimensional array of size N x N containing integers,
    // prints it, and decides whether it contains any two neighbor elements which are the same?

    public Boolean isContainsNeighbor(int n) {
        int[][] twoDArray = create2DArrayWithRandomNumbers(n);
        displayMatrix(twoDArray);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(n>=j+1 && twoDArray[i][j] == twoDArray[i][j+1] || n>=i+1 && twoDArray[i][j] == twoDArray[i+1][j]) {
                    return true;
                }
            }
        }
        return false;
    }

}

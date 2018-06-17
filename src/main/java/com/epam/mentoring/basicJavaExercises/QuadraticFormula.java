package com.epam.mentoring.basicJavaExercises;

public class QuadraticFormula {

    //Write a method that takes a, b, c integers as input and calculates the result of the ax2+bx+c=0 equation!

    public double calcQuadraticFormula(int a, int b, int c) {
        int dividend = b * b - 4 * a * c;
        int divider = 2 * a;
        return (-b + Math.sqrt(dividend) / divider);
    }

}

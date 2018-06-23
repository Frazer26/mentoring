package com.epam.mentoring.basicJavaExercises;

public class QuadraticFormula {

    //Write a method that takes a, b, c integers as input and calculates the result of the ax2+bx+c=0 equation!

    public void calcQuadraticFormula(int a, int b, int c) {
        double x1;
        double x2;
        int discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two solutions: \n x1 = " + x1 + "\n x2 = " + x2);
        }else if (discriminant ==0 ){
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("One solution: \n x1 = " + x1);
        } else {
            System.out.println("No solution.");
        }
    }

}

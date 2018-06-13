package com.epam.mentoring.basicJavaExercises;

public class FizzBuzz {

//   Write a method that prints the numbers between 1 and 100, but:
//  *if a number is divisible by 3 then print "Fizz" instead of the number,
//  *if a number is divisible by 5 then print "Buzz" instead of the number,
//  *if a number is divisible by 3 and 5 then print "Fizz Buzz" instead of the number.

    public void solveFizzBuzzProblem() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz, ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz, ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz, ");
            } else {
                System.out.print(i + ", ");
            }
        }

    }
}

package com.epam.mentoring.basicJavaExercises;

public class Main {

    public static void main(String[] args) {
        UniqueNumbers uniqueNumbers = new UniqueNumbers();
        uniqueNumbers.createThreeDigitNums();

        System.out.println();

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.solveFizzBuzzProblem();
    }
}

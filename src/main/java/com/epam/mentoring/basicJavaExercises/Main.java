package com.epam.mentoring.basicJavaExercises;

public class Main {

    public static void main(String[] args) {
        UniqueNumbers uniqueNumbers = new UniqueNumbers();
        uniqueNumbers.createThreeDigitNums();

        System.out.println();

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.solveFizzBuzzProblem();

        System.out.println();

        Year year = new Year();
        System.out.println(year.percentageOfYearCount(2018,1,14,22,48));
    }
}

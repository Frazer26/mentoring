package com.epam.mentoring.basicJavaExercises;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        UniqueNumbers uniqueNumbers = new UniqueNumbers();
        uniqueNumbers.createThreeDigitNums();

        System.out.println();

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.solveFizzBuzzProblem();

        System.out.println();

        Year year = new Year();
        System.out.println(year.percentageOfYearCount(2018,6,14,22,23));

        Validation email = new Validation();
        System.out.println(email.validateEmail(null));

        oddTimes asd = new oddTimes();
        System.out.println(Arrays.toString(asd.foundOddOccurrence(new int[]{2,2,5,8,9})));

        Rotation rotation = new Rotation();
        rotation.rotateNums(new int[]{1,2,3,4});
        rotation.rotateNums(new int[0]);
        rotation.rotateNums(new int[]{1});
        rotation.rotateNums(new int[]{1,2});
    }
}

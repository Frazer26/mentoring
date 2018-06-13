package com.epam.mentoring.basicJavaExercises;

public class SumOfDigits {

    //Write a method to compute the sum of the digits of an integer!
    public int sumOfDigits(int number) {
        int absNumber = Math.abs(number);
        int sum = 0;
        while (absNumber > 0) {
            int digit = absNumber % 10;
            sum = sum + digit;
            absNumber = absNumber / 10;
        }
        return sum;
    }
}

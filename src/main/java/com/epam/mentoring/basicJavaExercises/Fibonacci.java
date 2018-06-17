package com.epam.mentoring.basicJavaExercises;

public class Fibonacci {

//    Write a method that takes an integer as input and returns true
//    if the given number is element of the Fibonacci sequence and false if it isn' t!

    public Boolean findFibonacci(int num) {
        int firstNum = 0;
        int secondNum = 1;
        int fiboNumber = 0;

        while (fiboNumber < num) {
            fiboNumber = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = fiboNumber;
        }
        return num == fiboNumber;
    }
}
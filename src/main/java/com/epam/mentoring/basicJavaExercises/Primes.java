package com.epam.mentoring.basicJavaExercises;

public class Primes {
//    Write a method that takes a positive integer as input
//    and counts the number of primes up to the given number! (including that one, too)

    public int countPrimes(int num) {
        int count = 0;
        for (int i = 0; i <= num; i++) {
            if (isPrime(i)) {
                ++count;
            }
        }
        return count;
    }

    public boolean isPrime(int num) {
        Boolean prime = true;
        if (num < 2) {
            prime = false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                prime = false;
            }
        }
        return prime;
    }
}

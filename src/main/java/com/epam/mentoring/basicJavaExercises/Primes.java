package com.epam.mentoring.basicJavaExercises;

import static org.apache.commons.math3.primes.Primes.isPrime;

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
}

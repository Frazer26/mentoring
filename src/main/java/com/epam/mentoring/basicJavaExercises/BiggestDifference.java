package com.epam.mentoring.basicJavaExercises;

public class BiggestDifference {

//    Write a method that takes an array of integers as input and
//    returns the biggest difference between neighbor elements!

    public int countBiggestDifference(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        int dif;
        int biggestDif = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            dif = Math.abs(nums[i + 1] - nums[i]);
            if (biggestDif < dif) {
                biggestDif = dif;
            }
        }
        return biggestDif;
    }

}
package com.epam.mentoring.basicJavaExercises;

import java.util.HashSet;
import java.util.Set;

public class DuplicateIntegers {

    //Write a method that takes an array of integers
    // possibly containing duplicates and returns an array without duplicates!

    public int[] removeDuplicateNums(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }

        return numsSet.stream().mapToInt(i->i).toArray();
    }
}

package com.epam.mentoring.basicJavaExercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateIntegers {

    //Write a method that takes an array of integers
    // possibly containing duplicates and returns an array without duplicates!

    public int[] removeDuplicateNums(int[] nums) {
        List<Integer> duplicatedList = new ArrayList<Integer>();

        for (int num : nums) {
            duplicatedList.add(num);
        }

        Set<Integer> numsSet = new HashSet<Integer>();
        numsSet.addAll(duplicatedList);
        duplicatedList.clear();
        duplicatedList.addAll(numsSet);

        int[] onceNumsArray = copyListToArray(duplicatedList);

        return onceNumsArray;
    }

    private int[] copyListToArray(List<Integer> duplicatedList) {
        int[] onceNumsArray = new int[duplicatedList.size()];
        for (int i = 0; i < onceNumsArray.length; i++) {
            onceNumsArray[i] = duplicatedList.get(i);
        }
        return onceNumsArray;
    }
}

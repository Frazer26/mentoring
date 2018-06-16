package com.epam.mentoring.basicJavaExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class oddTimes {

//    Write a method that takes an array of integers as input
//    and returns an array containing those integers which can be found in the input odd times!
//    input: [4, 5, 2, 5, 7, 4, 5]
//    output: [2, 5, 7]

    public int[] foundOddOccurrence(int[] nums) {
        int counter = 1;
        List<Integer> odd = new ArrayList<Integer>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                counter += 1;
            } else {
                if (counter % 2 != 0) {
                    odd.add(nums[i]);
                }
                counter = 1;
            }
        }
        if (nums.length > 2 && counter % 2 != 0) {
            odd.add(nums[nums.length - 2]);
        }
        if (nums.length > 1 && nums[nums.length - 1] != nums[nums.length - 2]) {
            odd.add(nums[nums.length - 1]);
        }

        int[] array;
        array = convertIntegerListToIntArray(odd);

        return array;

    }

    public int[] convertIntegerListToIntArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
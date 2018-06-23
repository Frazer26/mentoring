package com.epam.mentoring.basicJavaExercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class oddTimes {

//    Write a method that takes an array of integers as input
//    and returns an array containing those integers which can be found in the input odd times!
//    input: [4, 5, 2, 5, 7, 4, 5]
//    output: [2, 5, 7]

    public int[] foundOddOccurrence(int[] nums) {
        List<Integer> oddList = new ArrayList<>();
        HashMap<Integer, Integer> numbers = new HashMap<>();

        for (int num : nums) {
            if (numbers.get(num) == null) {
                numbers.put(num, 1);
            } else {
                numbers.put(num, numbers.get(num) + 1);
            }
        }

        for (Integer key : numbers.keySet()) {
            if (numbers.get(key) % 2 == 1) {
                oddList.add(key);
            }
        }
        return convertIntegerListToIntArray(oddList);

    }

    public int[] convertIntegerListToIntArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
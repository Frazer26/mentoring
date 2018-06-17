package com.epam.mentoring.basicJavaExercises;

import java.util.Arrays;

public class Rotation {

//    Write a method that takes an array of integers as input and cyclically rotates it while prints it after every rotation!
//    input: [1, 2, 3, 4]
//    output: [4, 1, 2, 3], [3, 4, 1, 2], ....

    public void rotateNums(int[] nums) {
        try{
            int realFirstElement = nums[0];
            do {
                int replacement = nums[nums.length - 1];
                System.arraycopy(nums, 0, nums, 1, nums.length - 1);
                nums[0] = replacement;

                System.out.println(Arrays.toString(nums));
            } while (nums[0] != realFirstElement);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please give me more numbers. \n" + e.toString());
        }

    }

}

package com.epam.mentoring.basicJavaExercises;

public class UniqueNumbers {

    //Write a method to create and display unique 3-digit numbers using 1, 2, 3, 4!
    // Also, count the number of possible variations!
    public void createThreeDigitNums() {
        int count = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    if (i != j && j != k && i != k) {
                        System.out.println("" + i + j + k);
                        count++;
                    }
                }
            }
        }
        System.out.println(count + " the possible variations.");
    }


}

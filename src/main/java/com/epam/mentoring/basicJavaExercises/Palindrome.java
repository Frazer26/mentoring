package com.epam.mentoring.basicJavaExercises;


public class Palindrome {

    //Write a method that takes a string as input at determines whether it' s a palindrome or not!
    public Boolean isPalindrome(String word) {
        try {
            String backwardsString = new StringBuffer(word).reverse().toString();
            return word.equals(backwardsString);
        } catch (NullPointerException e) {
            e.getMessage();
        }
        return false;
    }
}

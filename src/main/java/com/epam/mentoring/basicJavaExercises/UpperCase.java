package com.epam.mentoring.basicJavaExercises;

import org.apache.commons.text.WordUtils;

public class UpperCase {

    public static final String whiteSpace = " ";
    public static final String endOfChar = ".$";

    //Write a method that takes a string (a sentence) as input and converts the first letter of the words to uppercase!
    public String convertUpperCase(String sentence) {
        try {
            return WordUtils.capitalize(sentence);
        } catch (NullPointerException e) {
            System.err.println("Please give me a sentence! \n" + e.getMessage());
        }
        return "";
    }

    //This solution is own "puritan" solution
    public String convertUpperCase2(String sentence) {
        String[] parts;
        StringBuilder sb = new StringBuilder();
        try {
            if (!sentence.contains(" ")) {
                return "";
            } else {
                parts = sentence.split(whiteSpace);
                for (String word : parts) {
                   sb.append(word.substring(0,1).toUpperCase() + word.substring(1) + " ");
                }
                return sb.toString().replaceFirst(endOfChar,"");
            }
        } catch (NullPointerException e) {
            System.err.println("Please give me a sentence! \n" + e.getMessage());
        }
        return "";
    }
}

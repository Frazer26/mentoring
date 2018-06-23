package com.epam.mentoring.basicJavaExercises;


public class StringCutter {

    //    Write a method that takes a string (a sentence) and integer 'n' as input and returns
//    the longest possible string trimmed at the nth character without cutting any word in half!
//    input: "This is a very long sentence.
//    You should trim it at the nth character but don' t cut any word in half.
//    Instead, move back to the closest whitespace and trim there!", 25
//    ouput: "This is a very long"

//    public String splitString(String str, int n) {
//        int count = 0;
//        StringBuilder sb = new StringBuilder();
//
//        if (str == null || n <= 0) {
//            return "";
//        }
//
//        String[] words = str.split(whiteSpace);
//        for (String word : words) {
//            count += word.length();
//            if (count < n) {
//                sb.append(word).append(" ");
//            }
//            count += 1; //cause of whitespace
//        }
//
//        return sb.toString().replaceFirst(endOfChar, "");
//    }

    public String splitString(String str, int n) {
        String sentence = "";

        if (str == null || n <= 0 || n > str.length()) {
            return "";
        }

        if (Character.isWhitespace(str.charAt(n + 1))) {
            sentence = str.substring(0, n);
        }

        for (int i = n - 1; i >= 0; i--) {
            if (Character.isWhitespace(str.charAt(i))) {
                sentence = str.substring(0, i);
                break;
            }
        }
        return sentence;
    }
}


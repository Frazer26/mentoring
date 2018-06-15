package com.epam.mentoring.basicJavaExercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

//    Write a method that validates a Hungarian email address!
//    It must be in the form of: valaki@valahol.hu
//    It can only contain letters, digits, 'at' (@), 'dot' (.) and 'underscore' (_)

    public Boolean validateEmail(String email) {
        try {
            if (!isLastWordHu(email)) {
                return false;
            }
            String emailPattern = "^[a-zA-Z0-9_.]+@[a-zA-Z.]+?\\.[a-zA-Z]{2,3}$";
            Pattern p = Pattern.compile(emailPattern);
            Matcher m = p.matcher(email);
            return m.matches();

        } catch (NullPointerException e) {
            System.err.println("Please give me a valid email address! \n" + e.getMessage());
        }
        return false;
    }

    public Boolean isLastWordHu(String hunMail) {
        try {
            boolean isBiggerThanOne = hunMail.length() > 1;
            boolean isEqualsHu = (hunMail.substring(hunMail.length() - 2)).equals("hu");
            return isBiggerThanOne && isEqualsHu;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}

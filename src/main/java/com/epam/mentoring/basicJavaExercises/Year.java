package com.epam.mentoring.basicJavaExercises;

public class Year {
    //Write a method that takes a year, month, day, hour, minute as input and prints
    //what percentage passed since the start of the year! Leap years should be taken into account!

    public double percentageOfYearCount(int year, int month, int day, int hour, int minute) {
        int goneDays = day;
        int goneHours;
        int goneMinutes;
        int daysOfYear = isLeapYear(year) ? 365 : 364;
        double actualYearInMinutes = daysOfYear * 24 * 60;
        double percentage;

        switch (month) {
            case 12:
                goneDays += 30;
            case 11:
                goneDays += 30;
            case 10:
                goneDays += 31;
            case 9:
                goneDays += 31;
            case 8:
                goneDays += 31;
            case 7:
                goneDays += 30;
            case 6:
                goneDays += 31;
            case 5:
                goneDays += 30;
            case 4:
                goneDays += 31;
            case 3:
                goneDays += isLeapYear(year) ? 29 : 28;
            case 2:
                goneDays += 31;
                break;
        }

        goneHours = (goneDays - 1) * 24 + hour - 1;
        goneMinutes = goneHours * 60 + minute;
        percentage = goneMinutes / actualYearInMinutes * 100;

        return percentage;
    }

    public Boolean isLeapYear(int year) {
        Boolean leapYear = false;
        if (year % 4 == 0) {
            leapYear = true;
        }
        return leapYear;
    }
}

package com.epam.mentoring.basicJavaExercises;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Duration;

public class Year {
    //Write a method that takes a year, month, day, hour, minute as input and prints
    //what percentage passed since the start of the year! Leap years should be taken into account!

    public double percentageOfYearCount(int year, int month, int day, int hour, int minute) {
        int inYear = LocalDateTime.now().getYear();
        LocalDateTime from = LocalDateTime.of(inYear, Month.JANUARY, 1, 0, 0);
        LocalDateTime to = LocalDateTime.of(year, month, day, hour, minute);
        LocalDateTime end = LocalDateTime.of(inYear, Month.DECEMBER, 31, 0, 0);

        Duration durationFromStartOfYear = Duration.between(from, to);
        long diffMinutes = durationFromStartOfYear.toMinutes();

        Duration durationToEndOfYear = Duration.between(from, end);
        long diffMinutesEndOfYear = durationToEndOfYear.toMinutes();

        return Double.longBitsToDouble(diffMinutes) / Double.longBitsToDouble(diffMinutesEndOfYear) * 100;
    }

}

package basicJavaExercisesTest;

import com.epam.mentoring.basicJavaExercises.Year;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YearTest {

    private Year year = new Year();
    private int result;
    private Boolean leapYear;

    @Test
    public void whenYearLeapShouldReturnTrue() {
        leapYear = year.isLeapYear(2012);
        assertEquals(true,leapYear);
    }

    @Test
    public void whenYearNotLeapShouldReturnFalse() {
        leapYear = year.isLeapYear(2014);
        assertEquals(false,leapYear);
    }

    @Test
    public void whenEndOfYearShouldReturn100Percentage() {
        result = (int) year.percentageOfYearCount(2018,12,31,23,59);
        assertEquals(100,result);
    }

    @Test
    public void whenStartOfYearShouldReturn0Percentage() {
        result = (int) year.percentageOfYearCount(2018,1,1,0,0);
        assertEquals(0,result);
    }


}

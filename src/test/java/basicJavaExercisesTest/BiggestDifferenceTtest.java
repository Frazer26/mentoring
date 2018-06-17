package basicJavaExercisesTest;

import com.epam.mentoring.basicJavaExercises.BiggestDifference;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BiggestDifferenceTtest {

    private BiggestDifference biggestDifference = new BiggestDifference();
    private int actual;


    @Test
    public void whenArrayIsEmptyShouldReturn0() {
        actual = biggestDifference.countBiggestDifference(new int[0]);
        assertEquals(0, actual);
    }

    @Test
    public void whenArrayContainsOneElementShouldReturn0() {
        actual = biggestDifference.countBiggestDifference(new int[]{1});
        assertEquals(0, actual);
    }

    @Test
    public void whenArrayContainsDifferenceElementShouldReturnBiggestDifNumber() {
        actual = biggestDifference.countBiggestDifference(new int[]{1, 1, 5, 10, -50, -1, 1, -5, 5});
        assertEquals(60, actual);
    }

    @Test
    public void whenArrayContainsSameElementsShouldReturn0() {
        actual = biggestDifference.countBiggestDifference(new int[]{1, 1, 1, 1, 1});
        assertEquals(0, actual);
    }
}

package basicJavaExercisesTest;

import com.epam.mentoring.basicJavaExercises.oddTimes;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class oddTimesTest {

    private oddTimes oddTimes = new oddTimes();
    private int[] result;
    private int[] emptyArray = new int[0];

    @Test
    public void whenTheArrayIsEmptyShouldReturnEmptyArray() {
        result = oddTimes.foundOddOccurrence(emptyArray);
        assertArrayEquals(new int[0], result);
    }


    @Test
    public void whenTheArrayContainsOddTimesValidNumsShouldReturnAnIntArray() {
        int[] oddTimesNums = new int[]{2,2,2,5,5,8,9,9,9,6,6,6,6};
        int[] expected = new int[]{2,8,9};
        result = oddTimes.foundOddOccurrence(oddTimesNums);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenTheArrayDoesNotContainOddTimesValidNumsShouldReturnAnEmptyArray() {
        int[] evenTimesNums = new int[]{2,2,4,4,5,5,5,5};
        int[] expected = new int[]{2,2,4,4,5,5,5,5};
        result = oddTimes.foundOddOccurrence(evenTimesNums);
        assertArrayEquals(emptyArray, result);
    }
}

package basicJavaExercisesTest;

import com.epam.mentoring.basicJavaExercises.DuplicateIntegers;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DuplicateIntegersTest {

    private DuplicateIntegers dupInt = new DuplicateIntegers();
    private int[] actual;
    private int[] emptyArray = new int[0];

    @Test
    public void whenArrayContainsDuplicatedNumsShouldLeaveThese() {
        int[] expected = {1, 2, 3, 4, 5};
        int[] duplicatedArray = {1, 1, 1, 2, 2, 3, 4, 4, 4, 4, 4, 4, 5};
        actual = dupInt.removeDuplicateNums(duplicatedArray);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void whenInputIsEmptyShouldReturnEmptyArray() {
        actual = dupInt.removeDuplicateNums(emptyArray);
        assertArrayEquals(emptyArray,actual);
    }
}

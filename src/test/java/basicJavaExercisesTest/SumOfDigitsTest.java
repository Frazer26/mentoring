package basicJavaExercisesTest;

import com.epam.mentoring.basicJavaExercises.SumOfDigits;
import org.junit.Test;
import static org.junit.Assert.*;


public class SumOfDigitsTest {
    SumOfDigits sumOfDigits = new SumOfDigits();
    int result;

    @Test
    public void testSumOfDigitsIfNumberNegative() {
        result = sumOfDigits.sumOfDigits(-25);
        assertEquals(7,result);
    }

    @Test
    public void testSumOfDigitsIfNumberPositive() {
        result = sumOfDigits.sumOfDigits(999);
        assertEquals(27,result);
    }
}

package basicJavaExercisesTest;

import com.epam.mentoring.basicJavaExercises.SumOfDigits;
import org.junit.Test;
import static org.junit.Assert.*;


public class SumOfDigitsTest {

    private SumOfDigits sumOfDigits = new SumOfDigits();
    private int result;

    @Test
    public void whenNumberNegativeShouldLeaveMinusSignAndAddDigits() {
        result = sumOfDigits.sumOfDigits(-25);
        assertEquals(7,result);
    }

    @Test
    public void whenNumberPositiveAddDigits() {
        result = sumOfDigits.sumOfDigits(999);
        assertEquals(27,result);
    }
}

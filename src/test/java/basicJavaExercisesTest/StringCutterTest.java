package basicJavaExercisesTest;

import com.epam.mentoring.basicJavaExercises.StringCutter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCutterTest {

    private StringCutter cutter = new StringCutter();
    String result;

    @Test
    public void whenCutMiddleOfTheWordShouldGoToBeforeWord() {
        result = cutter.splitString("This is a very long sentence.",25);
        assertEquals("This is a very long",result);
    }

    @Test
    public void whenStringNullShouldReturnEmptyString() {
        result = cutter.splitString(null,25);
        assertEquals("",result);
    }


    @Test
    public void whenSentenceLessThanIntegerShouldReturnEmptyString() {
        result = cutter.splitString("",25);
        assertEquals("",result);
    }
}

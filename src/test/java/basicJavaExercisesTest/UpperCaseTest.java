package basicJavaExercisesTest;

import com.epam.mentoring.basicJavaExercises.UpperCase;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class UpperCaseTest {

    private UpperCase upperCase = new UpperCase();
    private String sentence;

    @Test
    public void whenInputEmptyShouldReturnEmptyString() {
        sentence = upperCase.convertUpperCase2("");
        assertEquals("", sentence);
    }

    @Test
    public void whenInputNullShouldReturnEmptyString() {
        sentence = upperCase.convertUpperCase2(null);
        assertEquals("", sentence);
    }

    @Test
    public void whenInputASentenceShouldReturnFirstWorldsUppercase() {
        String sentence = upperCase.convertUpperCase2("this is a random sentence");
        assertThat(sentence, is(equalTo("This Is A Random Sentence")));
    }
}

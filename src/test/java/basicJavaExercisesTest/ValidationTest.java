package basicJavaExercisesTest;

import com.epam.mentoring.basicJavaExercises.Validation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidationTest {

    private Validation validation = new Validation();
    private Boolean isHuWord;
    private Boolean validMail;

    @Test
    public void whenWordEqualsHuShouldReturnTrue() {
        isHuWord = validation.isLastWordHu("hu");
        assertEquals(true, isHuWord);
    }

    @Test
    public void whenLastWordEqualsHuShouldReturnTrue() {
        isHuWord = validation.isLastWordHu("alahu");
        assertEquals(true, isHuWord);
    }

    @Test
    public void whenLastWordNotEqualsHuShouldReturnFalse() {
        isHuWord = validation.isLastWordHu("com");
        assertEquals(false, isHuWord);
    }

    @Test
    public void whenEmailParameterNullShouldReturnFalse() {
        validMail = validation.validateEmail(null);
        assertEquals(false, validMail);
    }

    @Test
    public void whenEmailParameterProperlyShouldReturnTrue() {
        validMail = validation.validateEmail("val_ami23@valaki.hu");
        assertEquals(true, validMail);
    }

    @Test
    public void whenEmailParameterFaultyShouldReturnFalse() {
        validMail = validation.validateEmail("val_ami23@v*/alaki.kom");
        assertEquals(false, validMail);
    }
}

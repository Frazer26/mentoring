package basicJavaExercisesTest;

import com.epam.mentoring.basicJavaExercises.Validation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidationTest {

    private Validation validation = new Validation();
    private Boolean validMail;

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

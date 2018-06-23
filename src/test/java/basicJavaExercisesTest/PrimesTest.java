package basicJavaExercisesTest;

import com.epam.mentoring.basicJavaExercises.Primes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimesTest {

    private Primes primes = new Primes();

    @Test
    public void whenTheInputAPositiveNumberShouldCountPrimes() {
        int count = primes.countPrimes(29);
        assertEquals(10, count);
    }
}

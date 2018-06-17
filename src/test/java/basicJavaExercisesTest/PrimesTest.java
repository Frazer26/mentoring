package basicJavaExercisesTest;

import com.epam.mentoring.basicJavaExercises.Primes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimesTest {

    private Primes primes = new Primes();
    Boolean prime;

    @Test
    public void whenTheInputPrimeShouldReturnTrue() {
        prime = primes.isPrime(5);
        assertEquals(true, prime);
    }

    @Test
    public void whenTheInputNotPrimeShouldReturnFalse() {
        prime = primes.isPrime(14);
        assertEquals(false, prime);
    }

    @Test
    public void whenTheInputAPositiveNumberShouldCountPrimes() {
        int count = primes.countPrimes(29);
        assertEquals(10, count);
    }
}

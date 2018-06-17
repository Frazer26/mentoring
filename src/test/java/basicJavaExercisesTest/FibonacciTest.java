package basicJavaExercisesTest;

import com.epam.mentoring.basicJavaExercises.Fibonacci;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();
    private Boolean actual;

    @Test
    public void whenFibonacciContainsInputNumberShouldReturnTrue(){
        actual = fibonacci.findFibonacci(144);
        assertEquals(true,actual);
    }

    @Test
    public void whenFibonacciDoesNotContainInputNumberShouldReturnFalse(){
        actual = fibonacci.findFibonacci(114);
        assertEquals(false,actual);
    }


}

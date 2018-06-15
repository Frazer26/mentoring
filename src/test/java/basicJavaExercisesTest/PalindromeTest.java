package basicJavaExercisesTest;

import com.epam.mentoring.basicJavaExercises.Palindrome;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeTest {

    private Palindrome palindrome = new Palindrome();
    private Boolean isPalindrome;

    @Test
    public void whenInputNotPalindromeShouldReturnFalse() {
        isPalindrome = palindrome.isPalindrome("cat");
        assertEquals(false,isPalindrome);
    }

    @Test
    public void whenInputPalindromeShouldReturnTrue() {
        isPalindrome = palindrome.isPalindrome("keretkarakterek");
        assertEquals(true,isPalindrome);
    }

    @Test
    public void whenInputNullShouldReturnFalse() {
        isPalindrome = palindrome.isPalindrome(null);
        assertEquals(false,isPalindrome);
    }
}

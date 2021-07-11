import org.junit.Assert;
import org.junit.Test;

public class PalindromeCheckerTest {
    @Test
    public void testPalindromeCheckerWithPositiveValues() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        int x = 12321;
        Assert.assertTrue(palindromeChecker.isPalindrome(x));
        x = 456;
        Assert.assertFalse(palindromeChecker.isPalindrome(x));
    }

    @Test
    public void testPalindromeCheckerWithNegativeValues() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        int x = -12321;
        Assert.assertTrue(palindromeChecker.isPalindrome(x));
        x = -456;
        Assert.assertFalse(palindromeChecker.isPalindrome(x));
    }

    @Test
    public void testPalindromeCheckerWithZeroValue() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        int x = 0;
        Assert.assertTrue(palindromeChecker.isPalindrome(x));
    }

    @Test
    public void testPalindromeCheckerWithMixedValues1() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        int x = 12321;
        Assert.assertTrue(palindromeChecker.isPalindrome(x));
        x = -456;
        Assert.assertFalse(palindromeChecker.isPalindrome(x));
    }

    @Test
    public void testPalindromeCheckerWithMixedValues2() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        int x = 456;
        Assert.assertFalse(palindromeChecker.isPalindrome(x));
        x = -12321;
        Assert.assertTrue(palindromeChecker.isPalindrome(x));
    }
}

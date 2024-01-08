package lab4_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPalindrome {
    @Test
    public void testIsPalindrome(){
        Assertions.assertTrue(Palindrome.isPalindrome("level"));
        Assertions.assertTrue(Palindrome.isPalindrome("Rotator"));
        Assertions.assertTrue(Palindrome.isPalindrome("UFO tofu"));
        Assertions.assertTrue(Palindrome.isPalindrome("No lemon, no melon"));
        Assertions.assertTrue(Palindrome.isPalindrome("Step on no pets?"));
        Assertions.assertTrue(Palindrome.isPalindrome("Yo, Banana boy!"));
        Assertions.assertTrue(Palindrome.isPalindrome("            "));
    }
    @Test
    public void testNotPalindrome(){
        Assertions.assertFalse(Palindrome.isPalindrome("123432"));
        Assertions.assertFalse(Palindrome.isPalindrome("Not a palindrome!"));
        Assertions.assertFalse(Palindrome.isPalindrome("rkrkrkrk"));
    }
}

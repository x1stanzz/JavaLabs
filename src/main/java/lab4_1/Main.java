package lab4_1;

public class Main {
    public static void main(String[] args) {
        String str1 = "never odd or even";
        String str2= "Red rum, sir, is murder!";
        String str3 = "Should return false";
        System.out.println(Palindrome.isPalindrome(str1));
        System.out.println(Palindrome.isPalindrome(str2));
        System.out.println(Palindrome.isPalindrome(str3));
    }
}

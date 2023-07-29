package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_6.day_3;

public class PalindromeCheckerTest {

    public static void main(String[] args) {
        PalindromeCheckerTest palindromeCheckerTest = new PalindromeCheckerTest();
        palindromeCheckerTest.isPalindromeTrueTest();
        palindromeCheckerTest.isPalindromeFalseTest();
    }
    public void isPalindromeTrueTest() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean expectedResult = true;
        boolean realResult = palindromeChecker.isPalindrome("kazak");
        if (realResult == expectedResult) {
            System.out.println("Palindrome true checker test = OK");
        }
        else {
            System.out.println("Palindrome true checker test = FAIL");
        }
    }
    public void isPalindromeFalseTest() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean expectedResult = false;
        boolean realResult = palindromeChecker.isPalindrome("kot");
        if (realResult == expectedResult) {
            System.out.println("Palindrome false checker test = OK");
        }
        else {
            System.out.println("Palindrome false checker test = FAIL");
        }
    }

}
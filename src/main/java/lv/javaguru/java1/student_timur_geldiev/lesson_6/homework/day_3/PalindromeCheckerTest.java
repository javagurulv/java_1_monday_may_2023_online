package lv.javaguru.java1.student_timur_geldiev.lesson_6.homework.day_3;

public class PalindromeCheckerTest {
    public static void main(String[] args) {
        PalindromeCheckerTest test = new PalindromeCheckerTest();
        test.checkIfPalindrome();
    }
    public void checkIfPalindrome(){
        String stringForTest = "Tenet";
        PalindromeChecker check = new PalindromeChecker();
        boolean actual = check.isPalindrome(stringForTest);
        checkResult(actual, true, "Check if palindrome" );
    }
    public void checkResult(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " Test PASS");
        } else {
            System.out.println(testName + " Test FAIL." + " Reason: " + "actualResult: " + actualResult + " not equal expected result: " + expectedResult );
        }
    }
}

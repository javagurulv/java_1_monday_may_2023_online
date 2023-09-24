package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_6.homework.day_3;

public class PalindromeCheckerTest {
    public static void main(String[] args) {
        PalindromeCheckerTest test = new PalindromeCheckerTest();
        test.test1();
        test.test2();
        test.test3();
    }
    public void test1(){
        String stringForTest = "Eve";
        PalindromeChecker check = new PalindromeChecker();
        boolean actual = check.isPalindrome(stringForTest);
        checkResult(actual, true, "test1" );
    }
    public void test2(){
        String stringForTest = "Radar";
        PalindromeChecker check = new PalindromeChecker();
        boolean actual = check.isPalindrome(stringForTest);
        checkResult(actual, true, "test2" );
    }
    public void test3(){
        String stringForTest = "ABC";
        PalindromeChecker check = new PalindromeChecker();
        boolean actual = check.isPalindrome(stringForTest);
        checkResult(actual, true, "test3" );
    }
    public void checkResult(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " PASS");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}
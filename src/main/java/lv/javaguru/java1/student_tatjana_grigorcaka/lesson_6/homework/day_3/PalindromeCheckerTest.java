package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.homework.day_3;

class PalindromeCheckerTest {

    public static void main(String[] args) {
        PalindromeCheckerTest test = new PalindromeCheckerTest();
        test.testPalindromeChecker();
    }

    public void testPalindromeChecker() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome("abba");
        checkResult((result),true, "testPalindromeChecker");
    }

    private void checkResult(boolean realResult,
                             boolean expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!" + " Expected result = " + expectedResult + " but Real result = " + realResult);
        }
    }
}


package lv.javaguru.java1.student_ainars_belinskis.lesson_6.homework.day_3;

class PalindromeCheckerTest {
    public static void main(String[] args) {
        PalindromeCheckerTest test = new PalindromeCheckerTest();
        test.testIsPalindrome();
        test.testNotPalindrome();

    }

    public void testIsPalindrome(){
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        String text = "boomoob";
        boolean result = palindromeChecker.isPalindrome(text);
        checkResult2(result,true, "testIsPalindrome");
    }
    public void testNotPalindrome(){
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        String text = "baomoob";
        boolean result = palindromeChecker.isPalindrome(text);
        checkResult2(result,false, "testNotPalindrome");
    }

    private void checkResult2(boolean realResult,
                              boolean expectedResult,
                              String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }


}

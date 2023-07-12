package lv.javaguru.java1.student_butrin_ilya.lesson_6.homework.day3;

public class PalindromeCheckerTest {
    PalindromeChecker palindromeChecker = new PalindromeChecker();
    public static void main(String[] args) {
        PalindromeCheckerTest test = new PalindromeCheckerTest();
        test.isPalinromeTrueRusTest();
        test.isPalinromeTrueEngTest();
        test.isPalinromeFalseRusTest();
        test.isPalinromeFalseEngTest();


    }
    public void isPalinromeTrueRusTest(){
        boolean realRezult = true;
       boolean expectedRezul = palindromeChecker.isPalindrome("топот");
        checkRezult(realRezult, expectedRezul, "IsPalinromeTrueRusTest");
    }
    public void isPalinromeTrueEngTest(){
        boolean realRezult = true;
        boolean expectedRezul = palindromeChecker.isPalindrome("ripir");
        checkRezult(realRezult, expectedRezul, "IsPalinromeTrueEngTest");
    }
    public void isPalinromeFalseRusTest(){
        boolean realRezult = false;
        boolean expectedRezul = palindromeChecker.isPalindrome("тута");
        checkRezult(realRezult, expectedRezul, "IsPalinromeFalseRusTest");
    }
    public void isPalinromeFalseEngTest(){
        boolean realRezult = false;
        boolean expectedRezul = palindromeChecker.isPalindrome("String");
        checkRezult(realRezult, expectedRezul, "IsPalinromeFalseEngTest");
    }
    public void checkRezult(boolean realRezult, Boolean expectedRezult, String testname){
        if (realRezult == expectedRezult) System.out.println("test " + testname + " IS OK");
        else System.out.println("test " + testname + " IS FAILED");
    }
}

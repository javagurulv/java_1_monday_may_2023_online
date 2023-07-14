package lv.javaguru.java1.student_alexey_kosmachev.lesson_6.homework.day_3;

public class PalindromeCheckerTest {

    // Kazak = True
    // Medved = False

    public static void main(String[] args) {

        PalindromeCheckerTest test = new PalindromeCheckerTest();
        test.test1();
        test.test2();

    }
    public void test1 () {
        PalindromeChecker word1 = new PalindromeChecker();
        boolean result = word1.isPalindrome("Kazak");
        if (result == true) {System.out.println("TEST OK!");}
        else {System.out.println("TEST FAIL!");}
        }
    public void test2 () {
        PalindromeChecker word2 = new PalindromeChecker();
        boolean result = word2.isPalindrome("Medved");
        if (result == false) {System.out.println("TEST OK!");}
        else {System.out.println("TEST FAIL!");}
    }

    }




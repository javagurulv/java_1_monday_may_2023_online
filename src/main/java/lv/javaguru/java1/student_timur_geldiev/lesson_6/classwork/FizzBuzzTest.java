package lv.javaguru.java1.student_timur_geldiev.lesson_6.classwork;

import lv.javaguru.java1.student_timur_geldiev.lesson_5.homework.day_1.IntToString;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test1 = new FizzBuzzTest();
        test1.checkFizz();
        test1.checkBuzz();
        test1.checkFizzBuzz();
        test1.checkIntReturn();
    }

    public void checkFizz() {
        IntToString check1 = new IntToString();
        String isFizz = check1.intToString(3);
        checkResult(isFizz, "Fizz", "checkFizz");
    }

    public void checkBuzz() {
        IntToString check1 = new IntToString();
        String isBuzz = check1.intToString(5);
        checkResult(isBuzz, "Buzz", "checkBuzz");

    }

    public void checkFizzBuzz() {
        IntToString check1 = new IntToString();
        String isFizzBuzz = check1.intToString(30);
        checkResult(isFizzBuzz, "FizzBuzz", "checkFizzBuzz");

    }

    public void checkIntReturn() {
        IntToString check1 = new IntToString();
        String isIntReturn = check1.intToString(1);
        checkResult(isIntReturn, "1", "checkIntReturn");

    }

    public void checkResult(String actualResult, String expectedResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " Test PASS");
        } else {
            System.out.println(testName + " Test FAIL");
        }
    }
}

package lv.javaguru.java1.student_timur_geldiev.lesson_6.homework.day_2;

public class MaxOfThreeNumbersTest {
    public static void main(String[] args) {
        MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
        test.firstNumberBiggest();
        test.secondNumberBiggest();
        test.thirdNumberBiggest();
        test.numbersEqual();
    }
    public void firstNumberBiggest(){
        int num1 = 5;
        int num2 = 3;
        int num3 = -5;
        MaxOfThreeNumbers test1 = new MaxOfThreeNumbers();
        int actual = test1.findMax(num1, num2, num3);
        checkResult(actual, 5, "First number check");
    }
    public void secondNumberBiggest(){
        int num1 = 5;
        int num2 = 10;
        int num3 = -5;
        MaxOfThreeNumbers test2 = new MaxOfThreeNumbers();
        int actual = test2.findMax(num1, num2, num3);
        checkResult(actual, 10, "Second number check");

    }
    public void thirdNumberBiggest(){
        int num1 = 5;
        int num2 = 3;
        int num3 = 9;
        MaxOfThreeNumbers test3 = new MaxOfThreeNumbers();
        int actual = test3.findMax(num1, num2, num3);
        checkResult(actual, 9, "Third number check");

    }
    public void numbersEqual(){
        int num1 = 5;
        int num2 = 5;
        int num3 = 5;
        MaxOfThreeNumbers test1 = new MaxOfThreeNumbers();
        int actual = test1.findMax(num1, num2, num3);
        checkResult(actual, 5, "Equal numbers check");

    }
    public void checkResult(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " Test PASS");
        } else {
            System.out.println(testName + " Test FAIL");
        }
    }
}

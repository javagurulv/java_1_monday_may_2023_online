package lv.javaguru.java1.student_alexey_kosmachev.lesson_6.homework.day_2;

public class MaxOfThreeNumbersTest {

    // test1   3, 2, 1
    // test2   3, 1, 2
    // test3   1, 3, 2
    // test4   2, 3, 1
    // test5   1, 2, 3
    // test6   2, 1, 3
    // test7   2, 2, 2

    public static void main(String[] args) {
        MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
        test.test7();
    }

    public void test1 () {
        MaxOfThreeNumbers first = new MaxOfThreeNumbers();
        int result = first.findMax(3,2,1);
        checkResult(result,3,"test1");
    }
    public void test2 () {
        MaxOfThreeNumbers first = new MaxOfThreeNumbers();
        int result = first.findMax(3,1,2);
        checkResult(result,3,"test2");
    }
    public void test3 () {
        MaxOfThreeNumbers first = new MaxOfThreeNumbers();
        int result = first.findMax(1,3,2);
        checkResult(result,3,"test3");
    }
    public void test4 () {
        MaxOfThreeNumbers first = new MaxOfThreeNumbers();
        int result = first.findMax(2,3,1);
        checkResult(result,3,"test4");
    }
    public void test5 () {
        MaxOfThreeNumbers first = new MaxOfThreeNumbers();
        int result = first.findMax(1,2,3);
        checkResult(result,3,"test5");  //не определяет третью переменную.Ошибка
    }
    public void test6 () {
        MaxOfThreeNumbers first = new MaxOfThreeNumbers();        // //не определяет третью переменную.Ошибка
        int result = first.findMax(2,1,3);
        checkResult(result,3,"test6");
    }

    public void test7 () {
        MaxOfThreeNumbers first = new MaxOfThreeNumbers();
        int result = first.findMax(2,2,2);
        checkResult(result,2,"test7");
    }

    private void checkResult(int realResult,
                             int expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }



}

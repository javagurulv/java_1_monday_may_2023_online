package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_6.homework.day_4;

public class FactorialRecursionTest {
    public static void main(String[] args) {
        FactorialRecursionTest test = new FactorialRecursionTest();
        test.test1();
        test.test2();
        test.test3();
    }
    public void test1() {
        FactorialRecursion factorial1 = new FactorialRecursion();
        int result = factorial1.factorial(0);
        checkResult(result, 1, "test1");
    }
    public void test2() {
        FactorialRecursion factorial2 = new FactorialRecursion();
        int result = factorial2.factorial(1);
        checkResult(result, 1, "test2");
    }
    public void test3() {
        FactorialRecursion factorial3 = new FactorialRecursion();
        int result = factorial3.factorial(8);
        checkResult(result, 40320, "test3");
    }
    private void checkResult(int realResult,
                             int expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": PASS");
        } else {
            System.out.println(testScenarioName + ": FAIL");
        }
    }


}
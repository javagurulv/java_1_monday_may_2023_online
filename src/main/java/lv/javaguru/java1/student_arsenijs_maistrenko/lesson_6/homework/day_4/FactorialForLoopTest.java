package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_6.homework.day_4;

public class FactorialForLoopTest {
    public static void main(String[] args) {
        FactorialForLoopTest test = new FactorialForLoopTest();
        test.test1();
        test.test2();
        test.test3();
    }
    public void test1() {
        FactorialForLoop factorial1 = new FactorialForLoop();
        int result = factorial1.factorial(0);
        checkResult(result, 1, "test1");
    }
    public void test2() {
        FactorialForLoop factorial2 = new FactorialForLoop();
        int result = factorial2.factorial(1);
        checkResult(result, 1, "test2");
    }
    public void test3() {
        FactorialForLoop factorial3 = new FactorialForLoop();
        int result = factorial3.factorial(4);
        checkResult(result, 24, "test3");
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
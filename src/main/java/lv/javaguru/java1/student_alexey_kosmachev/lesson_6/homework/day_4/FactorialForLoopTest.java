package lv.javaguru.java1.student_alexey_kosmachev.lesson_6.homework.day_4;

// n = 5 result 120
// n = 0 result 1
public class FactorialForLoopTest {

    public static void main(String[] args) {

        FactorialForLoopTest test = new FactorialForLoopTest();
        test.test1();
        test.test2();

    }

    public void test1() {
        FactorialForLoop factorial1 = new FactorialForLoop();
        int result = factorial1.factorial(5);
        checkResult(result, 120, "Factorial of 5 = 120");
    }
    public void test2() {
        FactorialForLoop factorial2 = new FactorialForLoop();
        int result = factorial2.factorial(0);
        checkResult(result, 1, "Factorial of 0 = 1");
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

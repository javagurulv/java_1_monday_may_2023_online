package lv.javaguru.java1.student_alexey_kosmachev.lesson_6.homework.day_4;

// n = 7 result 5040
// n = 0 result 1
public class FactorialRecursionTest {
    public static void main(String[] args) {

        FactorialRecursionTest test = new FactorialRecursionTest();
        test.test1();
        test.test2();

    }

    public void test1() {
        FactorialRecursion factorial1 = new FactorialRecursion();
        int result = factorial1.factorial(7);
        checkResult(result, 5040, "Factorial of 7 = 5040");
    }
    public void test2() {
        FactorialRecursion factorial2 = new FactorialRecursion();
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

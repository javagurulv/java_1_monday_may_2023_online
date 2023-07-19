package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.homework.day_4;

class FactorialForLoopTest {
// Test data 1: num1 = 7, expected result = 5040
// Test data 2: num1 = 0, expected result = 1
// Test data 3: num1 = -1, expected result = 1

    public static void main(String[] args) {
        FactorialForLoopTest test = new FactorialForLoopTest();
        test.testFactorialForLoopV1();
        test.testFactorialForLoopV2();
        test.testFactorialForLoopV3();
    }

    public void testFactorialForLoopV1() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int result = factorialForLoop.factorial(7);
        checkResult(result, 5040, "testFactorialForLoopV1");
    }

    public void testFactorialForLoopV2() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int result = factorialForLoop.factorial(0);
        checkResult(result, 1, "testFactorialForLoopV2");
    }
    public void testFactorialForLoopV3() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int result = factorialForLoop.factorial(-1);
        checkResult(result, 1, "testFactorialForLoopV3");
    }

    private void checkResult(int realResult,
                             int expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!" + " Expected result = " + expectedResult + " but Real result = " + realResult);
        }
    }
 }

package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.homework.day_4;

class FactorialForLoopTest {
// Test data 1: num1 = 7, expected result = 5040
    public static void main(String[] args) {
        FactorialForLoopTest test = new FactorialForLoopTest();
        test.testFactorialForLoop();
    }

    public void testFactorialForLoop() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int result = factorialForLoop.factorial(7);
        checkResult(result, 5040, "testFactorialForLoop");
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

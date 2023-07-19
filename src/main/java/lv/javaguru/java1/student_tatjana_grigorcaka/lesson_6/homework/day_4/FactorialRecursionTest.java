package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.homework.day_4;

class FactorialRecursionTest {

    // Test data 1: num1 = 8, expected result = 40320


    public static void main(String[] args) {
        FactorialRecursionTest test = new FactorialRecursionTest();
        test.testFactorialRecursion();
    }

    public void testFactorialRecursion() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int result = factorialRecursion.factorial(8);
        checkResult(result, 40320, "testFactorialRecursion");
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

package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.homework.day_2;

class MaxOfThreeNumbersTest {
    //Test data 1: num1 = 15, num2 = 7, num3 = 2; expected result: 15
    //Test data 2: num1 = 2, num2 = 8, num3 = -14; expected result: 8
    //Test data 3:  num1 = 0, num2 = 5, num3 = 11; expected result: 11
    //Test data 4: num1 = 14, num2 = 14, num3 = 14; expected result: 14

    public static void main(String[] args) {
        MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
        test.testFindMaxFirstNumBigger();
        test.testFindMaxSecondNumBigger();
        test.testFindMaxThirdNumBigger();
        test.testFindMaxNumEqual();
    }

    public void testFindMaxFirstNumBigger() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int result = maxOfThreeNumbers.findMax(15, 7, 2);
        checkResult(result, 15, "testFindMaxFirstNumBigger");
    }

    public void testFindMaxSecondNumBigger() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int result = maxOfThreeNumbers.findMax(2, 8, -14);
        checkResult(result,8, "testFindMaxSecondNumBigger");
    }

    public void testFindMaxThirdNumBigger() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int result = maxOfThreeNumbers.findMax(0, 5, 11);
        checkResult(result,11, "testFindMaxThirdNumBigger");
    }

    public void testFindMaxNumEqual() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int result = maxOfThreeNumbers.findMax(14, 14, 14);
        checkResult(result, 14, "testFindMaxNumEqual");
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!" + " Expected result = " + expectedResult + " but Real result = " + realResult);
        }
    }

}

package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.homework.day_2;

class MaxOfThreeNumbersTest {
    //Test data 1: num1 = 5, num2 = 7, num3 = 14; expected result: 14

    public static void main(String[] args) {
        MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
        test.testFindMax1();
    }

    public void testFindMax1() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int result = maxOfThreeNumbers.findMax(5, 7, 14);
        checkResult(result, 14, "testFindMax1");
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

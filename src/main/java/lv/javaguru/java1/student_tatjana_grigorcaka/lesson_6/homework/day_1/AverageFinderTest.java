package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.homework.day_1;

class AverageFinderTest {
    // Test data 1: num1 = 7, num2 = 8, expected result = 7.5
    // Test data 2: num1 = 0, num2 = 8, expected result = 4
    // Test data 3: num1 = -1, num2 = 8, expected result = 3.5

    public static void main(String[] args) {
        AverageFinderTest test = new AverageFinderTest();
        test.testAverageFinderV1();
        test.testAverageFinderV2();
        test.testAverageFinderV3();
    }

    public void testAverageFinderV1() {
        AverageFinder averageFinder = new AverageFinder();
        double result = averageFinder.findAverage(7, 8);
        checkResult(result, 7.5, "testAverageFinderV1");
    }

    public void testAverageFinderV2() {
        AverageFinder averageFinder = new AverageFinder();
        double result = averageFinder.findAverage(0, 8);
        checkResult(result, 4, "testAverageFinderV2");
    }

    public void testAverageFinderV3() {
        AverageFinder averageFinder = new AverageFinder();
        double result = averageFinder.findAverage(-1, 8);
        checkResult(result, 3.5, "testAverageFinderV3");
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

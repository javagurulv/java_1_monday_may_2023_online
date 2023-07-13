package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.homework.day_1;

class AverageFinderTest {
    // Test data 1: num1 = 7, num2 = 8, expected result = 7.5

    public static void main(String[] args) {
        AverageFinderTest test = new AverageFinderTest();
        test.testAverageFinder1();
    }

    public void testAverageFinder1() {
        AverageFinder averageFinder = new AverageFinder();
        double result = averageFinder.findAverage(7, 8);
        checkResult(result, 7.5, "testAverageFinder1");
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

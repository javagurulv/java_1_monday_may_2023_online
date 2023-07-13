package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.homework.day_1;

class TriangleSquareTest {
    // Test data 1: a = 2, b = 3, c = 4; expected result = 4.5
    // Test data 2: a = 2, b = 3, c = 4, s = 4.5; expected result = 2.9047375096555625

    public static void main(String[] args) {
        TriangleSquareTest test = new TriangleSquareTest();
        test.testSemiPerimeter1();
        test.testSquare1();
    }

    public void testSemiPerimeter1() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSemiPerimeter(2, 3, 4);
        checkResult(result, 4.5, "testSemiPerimeter1");
    }

    public void testSquare1() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSquare(2, 3, 4);
        checkResult(result, 2.9047375096555625, "testSquare1");
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


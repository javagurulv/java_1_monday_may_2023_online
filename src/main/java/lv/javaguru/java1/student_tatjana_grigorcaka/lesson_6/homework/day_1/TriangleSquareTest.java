package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.homework.day_1;

import static java.lang.Double.NaN;

class TriangleSquareTest {
    // Test data 1: a = 2, b = 3, c = 4; expected result = 4.5
    // Test data 2: a = 0, b = 3, c = 4; expected result = 3.5
    // Test data 3: a = -1, b = 3, c = 4; expected result = 3
    // Test data 4: a = 2, b = 3, c = 4, expected result = 2.9047375096555625
    // Test data 5: a = 0, b = 3, c = 4, expected result = NaN
    // Test data 6: a = -1, b = 3, c = 4,expected result = -0.0

    public static void main(String[] args) {
        TriangleSquareTest test = new TriangleSquareTest();
        test.testSemiPerimeterV1();
        test.testSemiPerimeterV2();
        test.testSemiPerimeterV3();
        test.testSquareV1();
        test.testSquareV2();
        test.testSquareV3();
    }

    public void testSemiPerimeterV1() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSemiPerimeter(2, 3, 4);
        checkResult(result, 4.5, "testSemiPerimeterV1");
    }

    public void testSemiPerimeterV2() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSemiPerimeter(0, 3, 4);
        checkResult(result, 3.5, "testSemiPerimeterV2");
    }
    public void testSemiPerimeterV3() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSemiPerimeter(-1, 3, 4);
        checkResult(result, 3, "testSemiPerimeterV3");
    }

    public void testSquareV1() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSquare(2, 3, 4);
        checkResult(result, 2.9047375096555625, "testSquareV1");
    }

    public void testSquareV2() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSquare(0, 3, 4);
        checkResult(result, NaN, "testSquareV2");
    }

    public void testSquareV3() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSquare(-1, 3, 4);
        checkResult(result, -0.0, "testSquareV3");
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


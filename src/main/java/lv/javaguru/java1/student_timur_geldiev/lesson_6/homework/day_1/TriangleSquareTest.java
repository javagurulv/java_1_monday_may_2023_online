package lv.javaguru.java1.student_timur_geldiev.lesson_6.homework.day_1;

import lv.javaguru.java1.student_timur_geldiev.lesson_5.classwork.TriangleSquare;

public class TriangleSquareTest {
    int a = 6;
    int b = 7;
    int c = 8;

    public static void main(String[] args) {
        TriangleSquareTest test1 = new TriangleSquareTest();
        test1.squareCalculation();
        test1.semiPerimeterCalculation();
    }

    public void squareCalculation() {
        TriangleSquare check1 = new TriangleSquare();
        double actual = check1.calculateSquare(a, b, c);
        checkResult(actual, 20.33316256758894, "SquareCalculationCheck");

    }

    public void semiPerimeterCalculation() {
        TriangleSquare check2 = new TriangleSquare();
        double actual = check2.findSemiPerimeter(a, b, c);
        checkResult(actual, 10.5, "SemiPerimeterCheck");
    }

    public void checkResult(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " Test PASS");
        } else {
            System.out.println(testName + " Test FAIL." + " Reason: " + "actualResult: " + actualResult + " not equal expected result: " + expectedResult );
        }
    }
}

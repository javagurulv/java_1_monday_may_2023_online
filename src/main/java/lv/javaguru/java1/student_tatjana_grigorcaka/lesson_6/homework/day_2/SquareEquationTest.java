package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.homework.day_2;

class SquareEquationTest {
    //Test data 1: a = 1, b = 5, c = 2; expected result = 17
    //Test data 2: a = 1, b = 5, c = 2; expected result = true
    //Test data 3: a = 1, b = 5, c = 2; expected result = -4.561552812808831
    //Test data 4: a = 1, b = 5, c = 2; expected result = -0.4384471871911697
    //Test data 5: a = 5, b = 1, c = 1; expected result = false

    public static void main(String[] args) {
        SquareEquationTest test = new SquareEquationTest();
        test.testDiscriminant();
        test.testIsSquareRootTrue();
        test.testFirstRoot();
        test.testSecondRoot();
        test.testIsSquareRootFalse();
    }

    public void testDiscriminant() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.discriminant(1, 5, 2);
        checkResultDouble(result, 17, "testDiscriminant");
    }

    public void testIsSquareRootTrue() {
        SquareEquation squareEquation = new SquareEquation();
        boolean result = squareEquation.isSquareRoot(1, 5, 2);
        checkResultBoolean(result, true, "testIsSquareRootTrue");
    }

    public void testFirstRoot() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.firstRoot(1, 5, 2);
        checkResultDouble(result, -4.561552812808831, "testFirstRoot");
    }

    public void testSecondRoot() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.secondRoot(1, 5, 2);
        checkResultDouble(result, -0.4384471871911697,"testSecondRoot");
    }
    public void testIsSquareRootFalse() {
        SquareEquation squareEquation = new SquareEquation();
        boolean result = squareEquation.isSquareRoot(5, 1, 1);
        checkResultBoolean(result, false, "testIsSquareRootFalse");
    }

    public void checkResultDouble(double realResult,
                                  double expectedResult,
                                  String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!" + " Expected result = " + expectedResult + " but Real result = " + realResult);
        }
    }

    public void checkResultBoolean(boolean realResult,
                                   boolean expectedResult,
                                   String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!" + " Expected result = " + expectedResult + " but Real result = " + realResult);
        }
    }
}


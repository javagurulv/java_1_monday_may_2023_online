package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.homework.day_2;

class SquareEquationTest {
    //Test data 1: a = 1, b = 5, c = 2; expected result = 17
    //Test data 2: a = 1, b = 5, c = 2; expected result = true
    //Test data 3: a = 2, b = 3, c = 4; expected result = -4.561552812808831
    //Test data 4: a = 2, b = 3, c = 4; expected result = -0.4384471871911697

    public static void main(String[] args) {
        SquareEquationTest test = new SquareEquationTest();
        test.testDiscriminant1();
        test.testIsSquareRoot2();
        test.testFirstRoot3();
        test.testSecondRoot4();
    }

    public void testDiscriminant1() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.discriminant(1, 5, 2);
        checkResultDouble(result, 17, "testDiscriminant1");
    }

    public void testIsSquareRoot2() {
        SquareEquation squareEquation = new SquareEquation();
        boolean result = squareEquation.isSquareRoot(1, 5, 2);
        checkResultBoolean(result, true, "testIsSquareRoot2");
    }

    public void testFirstRoot3() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.firstRoot(1, 5, 2);
        checkResultDouble(result, -4.561552812808831, "testFirstRoot3");
    }

    public void testSecondRoot4() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.secondRoot(1, 5, 2);
        checkResultDouble(result, -0.4384471871911697,"testSecondRoot4");
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


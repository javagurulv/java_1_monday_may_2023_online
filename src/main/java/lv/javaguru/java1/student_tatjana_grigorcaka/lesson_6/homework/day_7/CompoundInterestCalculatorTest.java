package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.homework.day_7;


class CompoundInterestCalculatorTest {
    // Test data 1: sum: 2000.00, interest: 5, year: 3; expected result: 2315.2500000000005
    // Test data 2: sum: 0.00, interest: 5, year: 3; expected result: 0.00
    // Test data 3: sum: 2000.00, interest: 0, year: 3; expected result: 2000.00
    // Test data 4: sum: 2000.00, interest: -1, year: 3; expected result: 1940.598
    // Test data 5: sum: 2000.00, interest: 0.5, year: 3; expected result: 2030.1502499999992
    // Test data 6: sum: 2000.00, interest: 0.5, year: 0; expected result: 2000.00

    public static void main(String[] args) {
        CompoundInterestCalculatorTest test = new CompoundInterestCalculatorTest();
        test.testCompoundInterestCalculatorV1();
        test.testCompoundInterestCalculatorV2();
        test.testCompoundInterestCalculatorV3();
        test.testCompoundInterestCalculatorV4();
        test.testCompoundInterestCalculatorV5();
        test.testCompoundInterestCalculatorV6();
    }

    public void testCompoundInterestCalculatorV1() {
        CompoundInterestCalculator compoundInterestCalculator= new CompoundInterestCalculator();
        double result = compoundInterestCalculator.CompoundInterest(2000.00, 5, 3);
        checkResult(result, 2315.2500000000005, "testCompoundInterestCalculatorV1");
    }

    public void testCompoundInterestCalculatorV2() {
        CompoundInterestCalculator compoundInterestCalculator= new CompoundInterestCalculator();
        double result = compoundInterestCalculator.CompoundInterest(0.00, 5, 3);
        checkResult(result, 0.00, "testCompoundInterestCalculatorV2");
    }

    public void testCompoundInterestCalculatorV3() {
        CompoundInterestCalculator compoundInterestCalculator= new CompoundInterestCalculator();
        double result = compoundInterestCalculator.CompoundInterest(2000.00, 0, 3);
        checkResult(result, 2000.00, "testCompoundInterestCalculatorV3");
    }

    public void testCompoundInterestCalculatorV4() {
        CompoundInterestCalculator compoundInterestCalculator= new CompoundInterestCalculator();
        double result = compoundInterestCalculator.CompoundInterest(2000.00, -1, 3);
        checkResult(result, 1940.598, "testCompoundInterestCalculatorV4");
    }

    public void testCompoundInterestCalculatorV5() {
        CompoundInterestCalculator compoundInterestCalculator= new CompoundInterestCalculator();
        double result = compoundInterestCalculator.CompoundInterest(2000.00, 0.5, 3);
        checkResult(result, 2030.1502499999992, "testCompoundInterestCalculatorV5");
    }

    public void testCompoundInterestCalculatorV6() {
        CompoundInterestCalculator compoundInterestCalculator= new CompoundInterestCalculator();
        double result = compoundInterestCalculator.CompoundInterest(2000.00, 0.5, 0);
        checkResult(result, 2000.00, "testCompoundInterestCalculatorV6");
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

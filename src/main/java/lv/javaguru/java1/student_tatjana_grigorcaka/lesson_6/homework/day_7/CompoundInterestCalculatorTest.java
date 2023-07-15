package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.homework.day_7;


class CompoundInterestCalculatorTest {
    //Test data 1: sum: 3000.00, interest: 5, year: 3; expected result: 2315.2500000000005

    public static void main(String[] args) {
        CompoundInterestCalculatorTest test = new CompoundInterestCalculatorTest();
        test.testCompoundInterestCalculator();
    }

    public void testCompoundInterestCalculator() {
        CompoundInterestCalculator compoundInterestCalculator= new CompoundInterestCalculator();
        double result = compoundInterestCalculator.CompoundInterest(2000.00, 5, 3);
        checkResult(result, 2315.2500000000005, "testCompoundInterestCalculator");
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

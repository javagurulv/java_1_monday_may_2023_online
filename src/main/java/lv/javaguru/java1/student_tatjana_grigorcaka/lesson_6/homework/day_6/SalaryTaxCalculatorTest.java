package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.homework.day_6;

class SalaryTaxCalculatorTest {

    //Test Data 1: salary: -1.00; expected result: 0.00
    //Test Data 2: salary: 0.00; expected result: 0.00
    //Test Data 3: salary: 1.00; expected result: 0.30
    //Test Data 4: salary: 10000.00; expected result: 3000.00
    //Test Data 5: salary: 10001.00; expected result: 3000.40
    //Test Data 6: salary: 50000.00; expected result: 19000.00
    //Test Data 7: salary: 50001.00; expected result: 19000.50

    public static void main(String[] args) {
        SalaryTaxCalculatorTest test = new SalaryTaxCalculatorTest();
        test.testSalaryTaxCalculatorV1();
        test.testSalaryTaxCalculatorV2();
        test.testSalaryTaxCalculator30TaxV1();
        test.testSalaryTaxCalculator30TaxV2();
        test.testSalaryTaxCalculator40TaxV1();
        test.testSalaryTaxCalculator40TaxV2();
        test.testSalaryTaxCalculator50Tax();
    }

    public void testSalaryTaxCalculatorV1(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate(-1.00);
        checkResult(result, 0.00, "testSalaryTaxCalculatorV1");
    }

    public void testSalaryTaxCalculatorV2(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate(0.00);
        checkResult(result, 0.00, "testSalaryTaxCalculatorV2");
    }
    public void testSalaryTaxCalculator30TaxV1(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate(1.00);
        checkResult(result, 0.30, "testSalaryTaxCalculator30TaxV1");
    }

    public void testSalaryTaxCalculator30TaxV2(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate(10000.00);
        checkResult(result, 3000.00, "testSalaryTaxCalculator30TaxV2");
    }

    public void testSalaryTaxCalculator40TaxV1(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate(10001.00);
        checkResult(result, 3000.40, "testSalaryTaxCalculator40TaxV1");
    }

    public void testSalaryTaxCalculator40TaxV2(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate(50000.00);
        checkResult(result, 19000.00, "testSalaryTaxCalculator40TaxV2");
    }

    public void testSalaryTaxCalculator50Tax(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate(50001.00);
        checkResult(result, 19000.50, "testSalaryTaxCalculator50Tax");
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

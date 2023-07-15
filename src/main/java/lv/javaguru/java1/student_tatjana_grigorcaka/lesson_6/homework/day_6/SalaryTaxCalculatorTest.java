package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.homework.day_6;

class SalaryTaxCalculatorTest {

    //Test Data 1: salary: 0.00; expected result: 0.00
    //Test Data 2: salary: 1.00; expected result: 0.30
    //Test Data 3: salary: 10000.00; expected result: 3000.00
    //Test Data 4: salary: 10001.00; expected result: 3000.40
    //Test Data 5: salary: 50000.00; expected result: 19000.00
    //Test Data 6: salary: 50001.00; expected result: 19000.50

    public static void main(String[] args) {
        SalaryTaxCalculatorTest test = new SalaryTaxCalculatorTest();
        test.testSalaryTaxCalculatorZero();
        test.testSalaryTaxCalculator30TaxV1();
        test.testSalaryTaxCalculator30TaxV2();
        test.testSalaryTaxCalculator40TaxV1();
        test.testSalaryTaxCalculator40TaxV2();
        test.testSalaryTaxCalculator50Tax();
    }

    public void testSalaryTaxCalculatorZero(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculateZero(0.00);
        checkResult(result, 0.00, "testSalaryTaxCalculatorZero");
    }
    public void testSalaryTaxCalculator30TaxV1(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate30Tax(1.00);
        checkResult(result, 0.30, "testSalaryTaxCalculator30TaxV1");
    }

    public void testSalaryTaxCalculator30TaxV2(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate30Tax(10000.00);
        checkResult(result, 3000.00, "testSalaryTaxCalculator30TaxV2");
    }

    public void testSalaryTaxCalculator40TaxV1(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate40Tax(10001.00);
        checkResult(result, 3000.40, "testSalaryTaxCalculator40TaxV1");
    }

    public void testSalaryTaxCalculator40TaxV2(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate40Tax(50000.00);
        checkResult(result, 19000.00, "testSalaryTaxCalculator40TaxV2");
    }

    public void testSalaryTaxCalculator50Tax(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate50Tax(50001.00);
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

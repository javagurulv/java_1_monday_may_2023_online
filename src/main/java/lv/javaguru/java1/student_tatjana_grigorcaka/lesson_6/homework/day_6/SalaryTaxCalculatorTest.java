package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.homework.day_6;

class SalaryTaxCalculatorTest {

    //Test Data 1: num1: 0.00; expected result: 0.00
    //Test Data 2: num1: 10000.00; expected result: 3000.00
    //Test Data 3: num1: 10001.00; expected result: 3000.40
    //Test Data 4: num1: 50000.00; expected result: 19000.00
    //Test Data 5: num1: 50001.00; expected result: 19000.50

    public static void main(String[] args) {
        SalaryTaxCalculatorTest test = new SalaryTaxCalculatorTest();
        test.testSalaryTaxCalculatorZeroTax1();
        test.testSalaryTaxCalculator30Tax2();
        test.testSalaryTaxCalculator40Tax3();
        test.testSalaryTaxCalculator40Tax4();
        test.testSalaryTaxCalculator50Tax5();
    }

    public void testSalaryTaxCalculatorZeroTax1(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculateZeroTax1(0.00);
        checkResult(result, 0.00, "testSalaryTaxCalculatorZeroTax1");
    }

    public void testSalaryTaxCalculator30Tax2(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate30Tax2(10000.00);
        checkResult(result, 3000.00, "testSalaryTaxCalculator30Tax2");
    }

    public void testSalaryTaxCalculator40Tax3(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate40Tax3(10001.00);
        checkResult(result, 3000.40, "testSalaryTaxCalculator40Tax3");
    }

    public void testSalaryTaxCalculator40Tax4(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate40Tax3(50000.00);
        checkResult(result, 19000.00, "testSalaryTaxCalculator40Tax4");
    }

    public void testSalaryTaxCalculator50Tax5(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate50Tax4(50001.00);
        checkResult(result, 19000.50, "testSalaryTaxCalculator50Tax5");
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

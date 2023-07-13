package lv.javaguru.java1.student_timur_geldiev.lesson_6.homework.day_6;

public class SalaryTaxCalculatorTest {
    public static void main(String[] args) {
        SalaryTaxCalculatorTest test = new SalaryTaxCalculatorTest();
        test.tax30check();
        test.tax40check();
        test.tax50check();
    }
    public void tax30check(){
        double salary = 9500;
        SalaryTaxCalculator test1 = new SalaryTaxCalculator();
        double actual = test1.calculate(salary);
        checkResult(actual, 2850, "30% check");
    }
    public void tax40check(){
        double salary = 20000;
        SalaryTaxCalculator test2 = new SalaryTaxCalculator();
        double actual = test2.calculate(salary);
        checkResult(actual, 7000, "40% check");
    }
    public void tax50check(){
        double salary = 60000;
        SalaryTaxCalculator test3 = new SalaryTaxCalculator();
        double actual = test3.calculate(salary);
        checkResult(actual, 24000, "50% check");
    }

    public void checkResult(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " Test PASS");
        } else {
            System.out.println(testName + " Test FAIL." + " Reason: " + "actualResult: " + actualResult + " not equal expected result: " + expectedResult );
        }
    }
}

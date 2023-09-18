package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_6.homework.day_6;


public class SalaryTaxCalculatorTest {
    public static void main(String[] args) {
        SalaryTaxCalculatorTest test = new SalaryTaxCalculatorTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    public void test1() {
        SalaryTaxCalculator salary1 = new SalaryTaxCalculator();
        double result = salary1.calculate(-1);
        checkResult(result, 0, "test1");
    }

    public void test2() {
        SalaryTaxCalculator salary2 = new SalaryTaxCalculator();
        double result = salary2.calculate(10);
        checkResult(result, 3, "test2");
    }

    public void test3() {
        SalaryTaxCalculator salary3 = new SalaryTaxCalculator();
        double result = salary3.calculate(12000);
        checkResult(result, 3800, "test3");
    }

    public void test4() {
        SalaryTaxCalculator salary4 = new SalaryTaxCalculator();
        double result = salary4.calculate(50000);
        checkResult(result, 19000, "test3");
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": PASS");
        } else {
            System.out.println(testScenarioName + ": FAIL");
        }
    }
}
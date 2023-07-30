package lv.javaguru.java1.student_ainars_belinskis.lesson_6.homework.day_6;

class SalaryTaxCalculatorTest {
    public static void main(String[] args) {
        SalaryTaxCalculatorTest test = new SalaryTaxCalculatorTest();
        test.calculateTaxUnder10kTest();
        test.calculateTaxUnder50kTest();
        test.calculateTaxMoreThen50kTest();

    }

    public void calculateTaxUnder10kTest(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double salary = 1000;
        double result = salaryTaxCalculator.calculate(salary);
        checkResult(result, 300,"calculateTaxUnder10kTest");

    }

    public void calculateTaxUnder50kTest(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double salary = 40000;
        double result = salaryTaxCalculator.calculate(salary);
        checkResult(result, 15000,"calculateTaxUnder50kTest");

    }

    public void calculateTaxMoreThen50kTest(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double salary = 60000;
        double result = salaryTaxCalculator.calculate(salary);
        checkResult(result, 24000,"calculateTaxMoreThen50kTest");

    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }

    // вот это более правильный метод сравнения чисел с запятой
    // это связано с представлением вещественных чисел в памяти компьютера
    // https://javarush.com/groups/posts/2136-ustroystvo-vejshestvennihkh-chisel
    private void checkResultWithThreshold(double realResult,
                                          double expectedResult,
                                          String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL! realResult = " + realResult + " expectedResult = " + expectedResult);
        }
    }

}

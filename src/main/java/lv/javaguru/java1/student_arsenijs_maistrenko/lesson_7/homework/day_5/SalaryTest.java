package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_7.homework.day_5;

public class SalaryTest {
    public static void main(String[] args) {

        SalaryTest test = new SalaryTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }
    public void test1() {
        Salary salary = new Salary();
        double[] salaries = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        double totalSalary = salary.sumTotalSalaryExpenses(salaries);
        checkResult(totalSalary, 14400.0, "ExpensesTest");
    }
    public void test2() {
        Salary salary = new Salary();
        double[] salaries = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        double minSalary = salary.findMinSumOfSalary(salaries);
        checkResult(minSalary, 1800.0, "SumTest");
    }
    public void test3() {
        Salary salary = new Salary();
        double[] salaries = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        double maxSalary = salary.findMaxSumOfSalary(salaries);
        checkResult(maxSalary, 4000.0, "MaxTest");
    }
    public void test4() {
        Salary salary = new Salary();
        double[] salaries = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        double averageSalary = salary.calculateAverageSumOfSalary(salaries);
        checkResult(averageSalary, 2880.0, "AvgTest");
    }
    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": PASS");
        } else {
            System.out.println(testScenarioName + ": FAIL");
        }
    }
}
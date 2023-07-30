package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.homework.day_5;


class SalaryStatisticTest {
    public static void main(String[] args) {

        SalaryStatisticTest test = new SalaryStatisticTest();
        test.testSumTotalSalaryExpenses();
        test.testFindMinSumOfSalary();
        test.testFindMaxSumOfSalary();
        test.testCalculateAverageSumOfSalary();
        test.testCalculateStandardDeviation();
    }

    public void testSumTotalSalaryExpenses() {
        SalaryStatistic salaryStatistic = new SalaryStatistic();
        double[] salaries = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        double totalSalary = salaryStatistic.sumTotalSalaryExpenses(salaries);
        checkResult(totalSalary, 14400.0, "testSumTotalSalaryExpenses");
    }

    public void testFindMinSumOfSalary() {
        SalaryStatistic salaryStatistic = new SalaryStatistic();
        double[] salaries = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        double minSalary = salaryStatistic.findMinSumOfSalary(salaries);
        checkResult(minSalary, 1800.0, "testFindMinSumOfSalary");
    }

    public void testFindMaxSumOfSalary() {
        SalaryStatistic salaryStatistic = new SalaryStatistic();
        double[] salaries = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        double maxSalary = salaryStatistic.findMaxSumOfSalary(salaries);
        checkResult(maxSalary, 4000.0, "testFindMaxSumOfSalary");
    }

    public void testCalculateAverageSumOfSalary() {
        SalaryStatistic salaryStatistic = new SalaryStatistic();
        double[] salaries = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        double averageSalary = salaryStatistic.calculateAverageSumOfSalary(salaries);
        checkResult(averageSalary, 2880.0, "testCalculateAverageSumOfSalary");
    }

    public void testCalculateStandardDeviation() {
        SalaryStatistic salaryStatistic = new SalaryStatistic();
        double[] salaries = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        double standardDeviation = salaryStatistic.calculateStandardDeviation(salaries);
        checkResult(standardDeviation, 730.479294709987, "testCalculateStandardDeviation");
    }


    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}


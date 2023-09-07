package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_7.day_5;

class PayrollAnalysisTest {

    public static void main(String[] args) {

        PayrollAnalysisTest payrollAnalysisTest = new PayrollAnalysisTest();
        payrollAnalysisTest.calculateTotalSalary();
        payrollAnalysisTest.findMinSalary();
        payrollAnalysisTest.findMaxSalary();
        payrollAnalysisTest.calculateAverageSalary();
        payrollAnalysisTest.calculateSigmaDeviation();
    }

    public void calculateTotalSalary() {
        PayrollAnalysis payrollAnalysis = new PayrollAnalysis();
        double[] salaries = {1500.0, 3600.0, 1900.0, 5000.0, 2400.0};
        double totalSalary = payrollAnalysis.calculateTotalSalary(salaries);
        checkResult(totalSalary, 14400.0, "calculateTotalSalary");
    }

    public void findMinSalary() {
        PayrollAnalysis payrollAnalysis = new PayrollAnalysis();
        double[] salaries = {1500.0, 3600.0, 1900.0, 5000.0, 2400.0};
        double minSalary = payrollAnalysis.findMinSalary(salaries);
        checkResult(minSalary, 1500.0, "findMinSalary");
    }

    public void findMaxSalary() {
        PayrollAnalysis payrollAnalysis = new PayrollAnalysis();
        double[] salaries = {1500.0, 3600.0, 1900.0, 5000.0, 2400.0};
        double maxSalary = payrollAnalysis.findMaxSalary(salaries);
        checkResult(maxSalary, 5000.0, "findMaxSalary");
    }

    public void calculateAverageSalary() {
        PayrollAnalysis payrollAnalysis = new PayrollAnalysis();
        double[] salaries = {1500.0, 3600.0, 1900.0, 5000.0, 2400.0};
        double averageSalary = payrollAnalysis.calculateAverageSalary(salaries);
        checkResult(averageSalary, 2880.0, "calculateAverageSalary");

    }
    public void calculateSigmaDeviation() {
        PayrollAnalysis payrollAnalysis = new PayrollAnalysis();
        double[] salaries = {1500.0, 3600.0, 1900.0, 5000.0, 2400.0};
        double sigmaDeviation = payrollAnalysis.calculateSigmaDeviation(salaries);
        checkResult(sigmaDeviation, 1273.420590378528, "calculateSigmaDeviation");
    }







    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": Test OK");
        }else {
            System.out.println(testScenarioName + ": Test FAIL");

        }
    }
}

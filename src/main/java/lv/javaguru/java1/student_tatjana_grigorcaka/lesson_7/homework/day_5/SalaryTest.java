package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.homework.day_5;


class SalaryTest {
    public static void main(String[] args) {
        double[] salary = new double[]{2500.0, 3200.0, 1800.0, 4000.0, 2900.0};

        Salary salary1 = new Salary();
        salary1.totalSumOfSalary(salary);
        salary1.maxSumOfSalary(salary);
        salary1.minSumOfSalary(salary);
        salary1.averageSumOfSalary(salary);
        System.out.println("RESULT: " + salary1.totalSumOfSalary(salary));
        System.out.println("RESULT: " + salary1.maxSumOfSalary(salary));
        System.out.println("RESULT: " + salary1.minSumOfSalary(salary));
        System.out.println("RESULT: " + salary1.averageSumOfSalary(salary));

        SalaryTest test = new SalaryTest();
        test.testTotalSumOfSalary(salary);
        test.testMaxSumOfSalary(salary);
        test.testMinSumOfSalary(salary);
        test.testAverageSumOfSalary(salary);
    }

    public void testTotalSumOfSalary(double[] salary) {
        double salaryTotal = 14400;
        Salary salary1 = new Salary();
        double result = salary1.totalSumOfSalary(salary);
        System.out.println("TEST RESULT (TOTAL): " + result);
        if (result == salaryTotal) {
            System.out.println("TEST RESULT: OK!");
        } else {
            System.out.println("TEST TEST: FAIL!");
        }
    }

    public void testMaxSumOfSalary(double[] salary) {
        double salaryMax = 4000.0;
        Salary salary1 = new Salary();
        double result = salary1.maxSumOfSalary(salary);
        System.out.println("TEST RESULT (MAX): " + result);
        if (result == salaryMax) {
            System.out.println("TEST RESULT: OK!");
        } else {
            System.out.println("TEST TEST: FAIL!");
        }
    }

    public void testMinSumOfSalary(double[] salary) {
        double salaryMin = 1800.0;
        Salary salary1 = new Salary();
        double result = salary1.minSumOfSalary(salary);
        System.out.println("TEST RESULT (MIN): " + result);
        if (result == salaryMin) {
            System.out.println("TEST RESULT: OK!");
        } else {
            System.out.println("TEST TEST: FAIL!");
        }
    }

    public void testAverageSumOfSalary(double[] salary) {
        double salaryAverage = 2880.0;
        Salary salary1 = new Salary();
        double result = salary1.averageSumOfSalary(salary);
        System.out.println("TEST RESULT (AVERAGE): " + result);
        if (result == salaryAverage) {
            System.out.println("TEST RESULT: OK!");
        } else {
            System.out.println("TEST TEST: FAIL!");
        }
    }


}

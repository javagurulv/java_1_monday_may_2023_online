package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_6.day_6;

class SalaryTaxCalculatorTest {

    public static void main(String[] args) {

        SalaryTaxCalculatorTest salaryTaxCalculatorTest = new SalaryTaxCalculatorTest();
        salaryTaxCalculatorTest.calculateTaxMoreThen50k();
        salaryTaxCalculatorTest.calculateTaxUnder50k();
        salaryTaxCalculatorTest.calculateTaxUnder10k();
    }
        public void calculateTaxMoreThen50k() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double salary = 65000.70;
        double expectedResult = 26500.35;
        double realResult = salaryTaxCalculator.calculate(salary);
        if (realResult == expectedResult) {
            System.out.println("More then 50k test = OK");
        }
        else {
            System.out.println("More then 50k test = FAIL");
        }

        }
        public void calculateTaxUnder50k() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double salary = 37550.65;
        double expectedResult = 14020.26;
        double realResult = salaryTaxCalculator.calculate(salary);
        if (realResult == expectedResult) {
            System.out.println("Under 50k test = OK");
        }
        else {
            System.out.println("Under 50k test = FAIL");
        }

        }
        public void calculateTaxUnder10k() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double salary = 4500.00;
        double expectedResult = 1350;
        double realResult = salaryTaxCalculator.calculate(salary);
        if (realResult == expectedResult) {
            System.out.println("Under 10k test = OK");
        }
        else {
            System.out.println("Under 10k test = FAIL");
        }

    }




    }


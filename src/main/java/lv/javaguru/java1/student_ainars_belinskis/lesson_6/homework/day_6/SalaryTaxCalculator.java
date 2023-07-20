package lv.javaguru.java1.student_ainars_belinskis.lesson_6.homework.day_6;

class SalaryTaxCalculator {

    public double calculate(double salary) {
        double tax = 0;
        if (salary < 0) {
            tax = 0;
        } else if (isSalaryUnder10k(salary)) {
            tax = calculateTaxUnder10k(salary);
        } else if (isSalaryMore10k(salary) && isSalaryUnder50k(salary)) {
            tax = calculateTaxUnder50k(salary);
        } else if (isSalaryMore50k(salary)) {
            tax = calculateTaxMoreThen50k(salary);
        } else {
            return tax;
        }
        return tax;
    }

    private static boolean isSalaryMore50k(double salary) {
        return salary >= 50000;
    }

    private boolean isSalaryUnder50k(double salary) {
        return salary < 50000;
    }

    private boolean isSalaryMore10k(double salary) {
        return salary >= 10000;
    }

    private boolean isSalaryUnder10k(double salary) {
        return salary < 10000;
    }

    private double calculateTaxMoreThen50k(double salary) {
        return 19000 + (((salary - 50000) / 100) * 50);
    }

    private double calculateTaxUnder50k(double salary) {
        return 3000 + (((salary - 10000) / 100) * 40);
    }

    private double calculateTaxUnder10k(double salary) {
        return (salary / 100) * 30;
    }

}

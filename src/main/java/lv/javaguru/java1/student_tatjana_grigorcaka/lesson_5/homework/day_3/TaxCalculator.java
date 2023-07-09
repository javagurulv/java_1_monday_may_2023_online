package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.homework.day_3;

class TaxCalculator {
    public double calculateTax(double annualIncome) {
           double tax = 0;
        if (annualIncome < 10000) {
            return tax = annualIncome / 100 * 30;
        } else if ((annualIncome >= 10000) && (annualIncome <= 50000)) {
            double reminder10k = annualIncome - 10000;
            double tax10k = 10000 / 100 * 30;
            double taxReminder = reminder10k / 100 * 40;
            return tax = tax10k + taxReminder;
        } else {
            double reminder50k = annualIncome - 50000;
            double tax10k = 10000 / 100 * 30;
            double tax50k = 40000 / 100 * 40;
            double taxReminder = reminder50k / 100 * 50;
            return tax = tax10k + tax50k + taxReminder;
        }
    }
}


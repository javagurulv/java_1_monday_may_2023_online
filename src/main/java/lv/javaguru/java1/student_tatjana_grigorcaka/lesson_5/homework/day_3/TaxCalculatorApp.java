package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.homework.day_3;

import java.util.Scanner;

class TaxCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter annual income: ");
        double annualIncome = scanner.nextInt();
        TaxCalculator taxCalculator1 = new TaxCalculator();
        double tax = taxCalculator1.calculateTax(annualIncome);
        System.out.println("Tax: " + tax);
    }
}

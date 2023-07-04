package lv.javaguru.java1.student_timur_geldiev.lesson_5.homework.day_3;

import java.util.Scanner;

class TaxCalculator {
    public double counter(double amount) {
        if (amount < 10000) {
            return amount * 0.3;
        } else if (amount >= 10000 && amount <= 50000) {
            double remainingIncome = amount - 10000;
            double tax10k = 10000 * 0.3;
            return tax10k + remainingIncome * 0.4;
        } else {
            double remainingIncome = amount - 50000;
            double tax50k = 10000 * 0.3 + 40000 * 0.4;
            return tax50k + remainingIncome * 0.5;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of money: ");
        double amount = sc.nextDouble();
        TaxCalculator calc1 = new TaxCalculator();
        double taxAmount = calc1.counter(amount);
        System.out.println("Your tax amount is " + taxAmount);
    }
}

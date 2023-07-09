package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_4.day_5;

import java.util.Scanner;

public class CommissionCalculation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();

        double amount1 = amount * 3 / 100;
        double amount2 = amount * 4 / 100;
        double amount3 = amount * 5 / 100;

        if(amount < 1000) {
            System.out.println("Commission 3% is: " + amount1);
        }
        else if(amount > 1000 && amount < 5000) {
            System.out.println("Commission 4% is: " + amount2);
        }
        else if(amount > 5000) {
            System.out.println("Commission 5% IS: " + amount3);
        }
    }
}

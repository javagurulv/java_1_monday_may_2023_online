package lv.javaguru.java1.student_timur_geldiev.lesson_4.homework.day_5;

import java.util.Scanner;

public class CommissionCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of money: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Enter correct amount");
        } else if (amount < 1000){
            double percentAmount = (amount * 3) / 100;
            System.out.println("The amount of commission for " + amount + " is 3% or " + percentAmount);
        } else if (amount >= 1000 && amount < 5000) {
            double percentAmount = (amount * 4) / 100;
            System.out.println("The amount of commission for " + amount + " is 4% or " + percentAmount);
        } else if (amount >= 5000) {
            double percentAmount = (amount * 5) / 100;
            System.out.println("The amount of commission for " + amount + " is 5% or " + percentAmount);
        } else {
            System.out.println("Something went wrong. Try again");
        }
    }
}

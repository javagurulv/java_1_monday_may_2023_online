package lv.javaguru.java1.student_timur_geldiev.lesson_4.classwork;

import java.util.Scanner;

public class TaxCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your annual income - ");
        int income = sc.nextInt();

        if(income < 10000){
            int tax = (income * 10) / 100;
            System.out.println("Your tax amount is " + tax);
        } else if (income >= 10000 && income < 20000) {
            int reminder10k = income - 10000;
            int tax10k = 10000 /100 * 10;
            int taxReminder = reminder10k /100 * 15;
            int tax = tax10k + taxReminder;
            System.out.println("Your tax amount is " + tax);
        } else if (income >= 20000) {
            int reminder20k = income - 20000;
            int tax10k = 10000 / 100 * 100;
            int tax20k = 10000 / 100 * 15;
            int taxReminder = reminder20k / 100 * 20;
            int tax = tax10k + tax20k + taxReminder;
            System.out.println("Your tax amount is " + tax);
        }
    }
}

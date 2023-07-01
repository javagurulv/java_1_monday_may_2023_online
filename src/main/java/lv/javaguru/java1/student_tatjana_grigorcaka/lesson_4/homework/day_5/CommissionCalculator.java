package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_4.homework.day_5;


import java.util.Scanner;

public class CommissionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter withdrawal amount: ");
        double amount = scanner.nextInt();


        if (amount < 1000) {
            double commission1 = (amount * 3) / 100;
            System.out.println("Commission amount is: " + commission1);
        }else if ((amount >= 1000) && (amount < 5000)) {
            double commission2 = (amount * 4) / 100;
            System.out.println("Commission amount  is: " + commission2);
        }else if (amount >= 5000) {
            double commission3 = (amount * 5) / 100;
            System.out.println("Commission amount is: " + commission3);

        }
    }
}

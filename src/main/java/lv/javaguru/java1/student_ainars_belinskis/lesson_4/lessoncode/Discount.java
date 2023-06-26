package lv.javaguru.java1.student_ainars_belinskis.lesson_4.lessoncode;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();

        double discount10 = (amount - ((amount / 100) * 10));
        double discount20 = (amount - ((amount / 100) * 20));

        if (amount < 5000) {
            System.out.println("Amount payable:" + amount);
        } else if ((amount >= 5000) && (amount < 10000)) {
            System.out.println("Amount payable:" + discount10);
        } else if (amount >= 10000) {
            System.out.println("Amount payable:" + discount20);
        }
    }
}

package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_4.lessoncode;

import java.util.Scanner;

class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount: ");
        int amount = scanner.nextInt();

        if (amount <= 5000) {
            System.out.println("Price:" + amount);
        } else if (amount > 5000 && amount <= 10000) {
            int discount10 = amount / 100 * 10;
            int discountedPrice10 = amount - discount10;
            System.out.println("Discounted price: " + discountedPrice10);

        } else if (amount > 10000) {
            int discount20 = amount / 100 * 20;
            int discountedPrice20 = amount - discount20;
            System.out.println("Discounted price: " + discountedPrice20);
        }
    }
}






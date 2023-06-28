package lv.javaguru.java1.student_ainars_belinskis.lesson_4.homework.day_5;

import java.util.Scanner;

class Commission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();

        double commission3 = (amount / 100) * 3;
        double commission4 = (amount / 100) * 4;
        double commission5 = (amount / 100) * 5;

        if (amount <= 1000) {
            System.out.println("Сommission amount: " + commission3);
        } else if ((amount > 1000) && (amount <= 5000)) {
            System.out.println("Сommission amount: " + commission4);
        } else if (amount > 5000) {
            System.out.println("Сommission amount: " + commission5);
        }



    }
}

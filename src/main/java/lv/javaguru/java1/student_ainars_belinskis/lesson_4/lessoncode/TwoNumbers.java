package lv.javaguru.java1.student_ainars_belinskis.lesson_4.lessoncode;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number2: ");
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println("Biggest number is " + number1);
        }
        if (number1 < number2) {
            System.out.println("Biggest number is " + number2);
        }

    }
}

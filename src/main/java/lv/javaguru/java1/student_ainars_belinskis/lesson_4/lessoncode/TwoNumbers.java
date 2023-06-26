package lv.javaguru.java1.student_ainars_belinskis.lesson_4.lessoncode;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println("Biggest number is " + number1);
        }
        if (number1 < number2) {
            System.out.println("Biggest number is " + number2);
        }

    }
}

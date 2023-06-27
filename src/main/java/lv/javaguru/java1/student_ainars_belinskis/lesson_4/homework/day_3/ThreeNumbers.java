package lv.javaguru.java1.student_ainars_belinskis.lesson_4.homework.day_3;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number2: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter number3: ");
        int number3 = scanner.nextInt();

        if ((number1 > number2) || (number1 > number3)) {
            System.out.println("Biggest number is " + number1);
            }
        if ((number1 > number2) && (number1 < number3)) {
            System.out.println("Biggest number is " + number3);
            }
        if ((number1 < number2) && (number2 < number3)) {
            System.out.println("Biggest number is " + number3);
            }
        if ((number1 < number2) && (number2 > number3)) {
            System.out.println("Biggest number is " + number2);
            }
        }


}


package lv.javaguru.java1.student_ainars_belinskis.lesson_4.homework.day_2;

import java.util.Scanner;

class TwoNumbersDifferent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number2: ");
        int number2 = scanner.nextInt();
        if ((number1 > number2) || (number1 < number2)) {
            System.out.println("Numbers " + number1 + " and " + number2 + " are different!!!");
            } else {
            System.out.println("The numbers " + number1 + " and " + number2 + " are equal!!!");
            }
        }

}


package lv.javaguru.java1.student_alexey_kosmachev.lesson_4.workinclass;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        boolean isNegative = number < 0;
        System.out.println("Number is negative = " + isNegative);

        boolean isZero = number == 0;
        System.out.println("Number is zero = " + isZero);

        boolean isPositive = number > 0;
        System.out.println("Number is positive = " + isPositive);
    }
}


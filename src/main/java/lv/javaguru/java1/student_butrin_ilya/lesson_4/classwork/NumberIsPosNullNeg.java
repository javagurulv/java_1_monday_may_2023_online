package lv.javaguru.java1.student_butrin_ilya.lesson_4.classwork;

import java.util.Scanner;

public class NumberIsPosNullNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        boolean isNegative = number < 0;
        boolean isZero = number == 0;
        boolean isPositive = number > 0;
        if (isPositive == true) {
            System.out.println("Number is positive = " + isPositive);
        } else if (isZero == true) {
            System.out.println("Number is zero = " + isZero);
        } else {
            System.out.println("Number is negative = " + isNegative);
        }
    }
}
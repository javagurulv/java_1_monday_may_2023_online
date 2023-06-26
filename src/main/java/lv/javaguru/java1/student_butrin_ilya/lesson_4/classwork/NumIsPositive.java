package lv.javaguru.java1.student_butrin_ilya.lesson_4.classwork;

import java.util.Scanner;

public class NumIsPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        boolean isNegative = number < 0;
        boolean isZero = number == 0;
        boolean isPositive = number > 0;
        if (isPositive) {
            System.out.println("Number is positive");
        }
        }
}

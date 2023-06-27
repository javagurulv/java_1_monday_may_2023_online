package lv.javaguru.java1.student_timur_geldiev.lesson_4.homework.day_2;

import java.util.Scanner;

public class EqualNotEqualInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Numbers are equal");
        } else if (num1 != num2) {
            System.out.println("Numbers are different");

        }
    }
}

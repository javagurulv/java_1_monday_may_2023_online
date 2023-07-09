package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_4.day_3;

import java.util.Scanner;

public class GreatestOfThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int c = scanner.nextInt();

        if (a > b && b > c) {
            System.out.println("Greatest number " + a);
        }
        else if (b > a && b > c) {
            System.out.println("Greatest number " + b);
        }
        else {
            System.out.println("Greatest number " + c);
        }
    }
}

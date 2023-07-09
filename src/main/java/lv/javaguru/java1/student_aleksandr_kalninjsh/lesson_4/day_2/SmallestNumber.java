package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_4.day_2;

import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Smallest number " + b);
        } else {
            System.out.println("Smallest number " + a);
        }
    }
}

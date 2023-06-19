package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_2;

import java.util.Scanner;

public class IfNumberEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        if (number %2 == 0) {
            System.out.println("Even number! ");
        } else {
            System.out.println("Odd number! ");
        }
    }
}
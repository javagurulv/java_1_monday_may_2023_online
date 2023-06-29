package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_4.homework.day_1;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter number: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }

}

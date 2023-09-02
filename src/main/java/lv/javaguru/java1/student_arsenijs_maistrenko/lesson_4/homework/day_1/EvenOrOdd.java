package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_4.homework.day_1;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("Your number is even number");
        } else {
            System.out.println("Your number is odd number");
        }

    }
}

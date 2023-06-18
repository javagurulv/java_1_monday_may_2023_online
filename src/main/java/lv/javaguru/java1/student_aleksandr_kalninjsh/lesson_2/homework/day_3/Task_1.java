package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_2.homework.day_3;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int mulResult = firstNumber * secondNumber;

        System.out.println(firstNumber + "*" + secondNumber + "=" + mulResult);
    }
}

package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_2.homework.day_3;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Enter the third number: ");
        double thirdNumber = scanner.nextDouble();

        double result = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Result is: " + result);


    }
}

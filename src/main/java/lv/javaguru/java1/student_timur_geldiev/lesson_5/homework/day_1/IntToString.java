package lv.javaguru.java1.student_timur_geldiev.lesson_5.homework.day_1;

import java.util.Scanner;

public class IntToString {
    public String intToString(int number) {
        if (isDividedBy3(number) && isDividedBy5(number)) {
            return "Fizz" + "Buzz";
        } else if (isDividedBy5(number)) {
            return "Buzz";
        } else if (isDividedBy3(number)) {
            return "Fizz";
        } else {
            return Integer.toString(number);
        }
    }

    private static boolean isDividedBy5(int number) {
        return number % 5 == 0;
    }

    private static boolean isDividedBy3(int number) {
        return number % 3 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        IntToString num1 = new IntToString();
        System.out.println(num1.intToString(number));
    }
}

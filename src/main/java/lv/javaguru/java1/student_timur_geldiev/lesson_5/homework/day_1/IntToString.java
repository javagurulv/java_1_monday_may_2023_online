package lv.javaguru.java1.student_timur_geldiev.lesson_5.homework.day_1;

import java.util.Scanner;

class IntToString {
    public String intToString(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "Fizz" + "Buzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else {
            return Integer.toString(number);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        IntToString num1 = new IntToString();
        System.out.println(num1.intToString(number));
    }
}

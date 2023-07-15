package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_4.homework.day_2;

import java.util.Scanner;

class SmallerNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int number2 = scanner.nextInt();

        if (number1 < number2) {
            System.out.println("The smaller number is: " + number1);
        }
        else if (number2 < number1) {
            System.out.println("The smaller number is: " + number2);
        }
        else {
            System.out.println("The numbers are same");
        }
    }

}




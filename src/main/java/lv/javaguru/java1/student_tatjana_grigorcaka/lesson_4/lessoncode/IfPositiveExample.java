package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_4.lessoncode;

import java.util.Scanner;

class IfPositiveExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        //1 var
        boolean isPositive = number > 0;
        if (isPositive) {
            System.out.println("Number is positive!");
        }
        //2 var
        if (number > 0) {
            System.out.println("Number is positive!");
        }

    }
}


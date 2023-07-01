package lv.javaguru.java1.student_alexey_kosmachev.lesson_4.workinclass;

import java.util.Scanner;

public class OrExample {

    // number < 1  OR  number > 10

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        if ((number < 1) || (number > 10)) {
            System.out.println("YES!");
        } else {
            System.out.println("NO!");
        }

    }

}

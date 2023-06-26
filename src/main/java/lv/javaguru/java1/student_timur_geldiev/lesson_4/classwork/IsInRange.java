package lv.javaguru.java1.student_timur_geldiev.lesson_4.classwork;

import java.util.Scanner;

public class IsInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number - ");
        int number = sc.nextInt();

        if (number >= 1 && number <= 10) {
            System.out.println("Number " + number + " is in range between 1 and 10");
        } else System.out.println("Number " + number + " is out of range between 1 and 10");
    }
}

package lv.javaguru.java1.student_timur_geldiev.lesson_4.classwork;

import java.util.Scanner;

public class IsPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("Number is positive!");
        }


    }
}


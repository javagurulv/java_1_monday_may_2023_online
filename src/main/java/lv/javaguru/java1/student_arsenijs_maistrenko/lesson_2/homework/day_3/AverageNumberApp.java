package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_2.homework.day_3;

import java.util.Scanner;

public class AverageNumberApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int aNum = in.nextInt();

        System.out.print("Input second number: ");
        int bNum = in.nextInt();

        System.out.print("Input third number: ");
        int cNum = in.nextInt();

        double a = (aNum + bNum + cNum) / 3;

        System.out.print("Average number is: " + a);
    }
}

package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_2.homework.day_3;

import java.util.Scanner;

public class MultTableApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = in.nextInt();
        for (int i=1; i< 11; i++) {

            System.out.println(number + " x " + i + " = " + number * i);
        }

    }
}

package lv.javaguru.java1.student_ainars_belinskis.lesson_4.homework.day_6;

import java.util.Scanner;

public class WeekDays2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day number from 1 to 7: ");
        int day = scanner.nextInt();
        switch (day) {
            case (1):
                System.out.println("Monday");
                break;
            case (2):
                System.out.println("Tuesday");
                break;
            case (3):
                System.out.println("Wednesday");
                break;
            case (4):
                System.out.println("Thursday");
                break;
            case (5):
                System.out.println("Friday");
                break;
            case (6):
                System.out.println("Saturday");
                break;
            case (7):
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You entered a number greater than 7.");
        }

        if (day == 1) {
            System.out.println("Monday");
        }
        if (day == 2) {
            System.out.println("Tuesday");
        }
        if (day == 3) {
            System.out.println("Wednesday");
        }
        if (day == 4) {
            System.out.println("Thursday");
        }
        if (day == 5) {
            System.out.println("Friday");
        }
        if (day == 6) {
            System.out.println("Saturday");
        }
        if (day == 7) {
            System.out.println("Sunday");
        }
        if (day > 7) {
            System.out.println("You entered a number greater than 7.");
        }

    }
}

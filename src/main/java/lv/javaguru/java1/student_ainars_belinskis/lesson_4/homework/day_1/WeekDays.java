package lv.javaguru.java1.student_ainars_belinskis.lesson_4.homework.day_1;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day number from 1 to 7: ");
        int day = scanner.nextInt();

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
    }
}

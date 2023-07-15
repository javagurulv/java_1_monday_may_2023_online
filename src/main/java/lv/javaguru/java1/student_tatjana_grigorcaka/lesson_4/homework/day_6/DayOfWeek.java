package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_4.homework.day_6;

import java.util.Scanner;

class DayOfWeek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number (1 to 7): ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Day 1 is Monday");
                break;
            case 2:
                System.out.println("Day 2 is Thursday");
                break;
            case 3:
                System.out.println("Day 3 is Wednesday");
                break;
            case 4:
                System.out.println("Day 4 is Thursday");
                break;
            case 5:
                System.out.println("Day 5 is in Friday");
                break;
            case 6:
                System.out.println("Day 6 is Saturday");
                break;
            case 7:
                System.out.println("Day 7 is Sunday!");
                break;
            default: System.out.println("Invalid day number!");
                break;
        }

        if (number == 1) {
            System.out.print("Monday");
        } else if (number == 2) {
            System.out.print("Tuesday");
        } else if (number == 3) {
            System.out.print("Wednesday");
        } else if (number == 4) {
            System.out.print("Thursday");
        } else if (number == 5) {
            System.out.print("Friday");
        } else if (number == 6) {
            System.out.print("Saturday");
        } else if (number == 7) {
            System.out.print("Sunday");
        } else {
            System.out.print("Invalid number");
        }
    }
}


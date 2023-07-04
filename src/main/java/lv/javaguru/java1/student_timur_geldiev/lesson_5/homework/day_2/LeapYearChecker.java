package lv.javaguru.java1.student_timur_geldiev.lesson_5.homework.day_2;

import java.util.Scanner;

class LeapYearChecker {
    public boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year your want to check: ");
        int year = sc.nextInt();
        LeapYearChecker check = new LeapYearChecker();

        if (check.isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

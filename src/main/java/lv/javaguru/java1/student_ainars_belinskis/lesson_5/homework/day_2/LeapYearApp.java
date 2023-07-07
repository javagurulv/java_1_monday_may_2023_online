package lv.javaguru.java1.student_ainars_belinskis.lesson_5.homework.day_2;

import java.util.Scanner;

class LeapYearApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        LeapYearDetector leapYearDetector = new LeapYearDetector();

        System.out.println("The " + year + " year is leap: " + leapYearDetector.isLeapYear(year));
        System.out.println("The " + (year + 1) + " year is leap: " + leapYearDetector.isLeapYear(year +1));
        System.out.println("The " + (year + 2) + " year is leap: " + leapYearDetector.isLeapYear(year + 2));
        System.out.println("The " + (year + 3) + " year is leap: " + leapYearDetector.isLeapYear(year + 3));
    }
}

package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.homework.day_2;

import java.util.Scanner;

public class LeapYearApp {
    public static void main(String[] args) {
        LeapYear year1 = new LeapYear();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = scanner.nextInt();

        if(year1.isLeapYear(year)) {
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }
    }
}



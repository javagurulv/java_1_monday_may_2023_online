package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_5.day_2;

import java.util.Scanner;

public class LeapYearDemo {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();

        LeapYear leapYear = new LeapYear();
        System.out.println(leapYear.isLeapYear(year));


    }
}

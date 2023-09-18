package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_5.homework.day_2;
import java.util.Scanner;
public class YearApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Leap year: ");
        int year = sc.nextInt();
        Year leapYear = new Year();
        System.out.println(leapYear.leapYear(year));
    }
}
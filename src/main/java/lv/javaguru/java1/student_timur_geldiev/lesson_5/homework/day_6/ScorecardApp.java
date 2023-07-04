package lv.javaguru.java1.student_timur_geldiev.lesson_5.homework.day_6;

import java.util.Scanner;

public class ScorecardApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark for Math: ");
        int math = sc.nextInt();
        System.out.println("Enter mark for Literature: ");
        int literature = sc.nextInt();
        System.out.println("Enter mark for Geography: ");
        int geography = sc.nextInt();
        System.out.println("Enter mark for Physics: ");
        int physics = sc.nextInt();

        Scorecard card1 = new Scorecard("John", "Smith", math, literature, geography, physics);
        System.out.println("Average mark for " + card1.studentName + " " + card1.studentLastName + " is: " + card1.findAverage(math, literature, geography, physics));
    }
}

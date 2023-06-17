package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_2.homework.day_3;

import java.util.Scanner;

public class CircleMathApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Radius: ");
        double radius = in.nextInt();
        System.out.println("Radius is: " + radius);
        double p = 2 * 3.14 * radius;
        double area = 3.14 * (radius * radius);

        System.out.println("Circle perimeter: " + p);
        System.out.println("Circle area: " + area);
    }
}

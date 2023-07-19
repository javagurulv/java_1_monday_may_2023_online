package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_5.day_4;

import java.util.Scanner;

public class CirclePerinetrAndArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the circle radius: ");
        double radius = scanner.nextDouble();

        double perimetr = 2 * 3.14 * radius;
        double area = 3.14 * radius * radius;

        System.out.println("Circle perimetr is: " + perimetr);
        System.out.println("Circle area is: " + area);
    }
}

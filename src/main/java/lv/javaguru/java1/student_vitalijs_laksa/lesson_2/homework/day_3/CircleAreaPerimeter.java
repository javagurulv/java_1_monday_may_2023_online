package lv.javaguru.java1.student_vitalijs_laksa.lesson_2.homework.day_3;

import java.util.Scanner;
public class CircleAreaPerimeter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius = sc.nextDouble();

        double perimeter = 2 * 3.1415926535897932384626433 * radius;
        double area = (3.1415926535897932384626433 * (radius * radius));

        System.out.print("Perimeter of Circle : " + perimeter );
        System.out.print("\nArea of Circle : " + area);

    }
}

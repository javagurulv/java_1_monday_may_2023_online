package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_2.homework.day_3;

import java.util.Scanner;
public class CircleAreaPerimeter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius = sc.nextDouble();

        double perimeter = 2 * 3.14 * radius;
        double area = (22 * radius * radius) / 7;

        System.out.print("Perimeter of Circle : " + perimeter);
        System.out.print("Area of Circle : " + area);


    }
}

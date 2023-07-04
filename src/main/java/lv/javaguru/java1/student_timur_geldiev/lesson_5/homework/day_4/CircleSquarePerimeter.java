package lv.javaguru.java1.student_timur_geldiev.lesson_5.homework.day_4;

import java.util.Scanner;

class CircleSquarePerimeter {
    public static double Square (double radius){
        return Math.PI * (radius * radius);
    }
    public static double Perimeter (double radius){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        double perimeter = Perimeter(radius);
        double square = Square(radius);
        System.out.println("Perimeter of a circle is: " + perimeter);
        System.out.println("Square of a circle is: " + square);
    }
}

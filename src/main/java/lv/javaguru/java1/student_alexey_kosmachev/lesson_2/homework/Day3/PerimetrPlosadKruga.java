package lv.javaguru.java1.student_alexey_kosmachev.lesson_2.homework.Day3;

import java.util.Scanner;

// Напишите программу, которая запрашивает у пользователя
//радиус круга (вещественное число) и печатает на консоль
//периметр и площадь круга.
public class PerimetrPlosadKruga {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input Radius: ");
        double Radius = in.nextDouble(); //

        double C = 2 * 3.14 * Radius;
        double A = 3.14 * Radius * Radius;

        System.out.println("Perimetr = " + C);
        System.out.println("Area = " + A);
    }
}

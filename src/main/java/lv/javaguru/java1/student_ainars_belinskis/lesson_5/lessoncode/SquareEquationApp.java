package lv.javaguru.java1.student_ainars_belinskis.lesson_5.lessoncode;

import java.util.Scanner;

class SquareEquationApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("The program solves a quadratic equation of the form:");
        System.out.println("ax^2 + bx + c = 0");

        System.out.println("Enter a:");
        int a = in.nextInt();

        System.out.println("Enter b:");
        int b = in.nextInt();

        System.out.println("Enter c:");
        int c = in.nextInt();

        SquareEquation square1 = new SquareEquation();

        System.out.println("D = " + square1.Discriminant(a, b, c));
        System.out.println("Square have roots = " + square1.isSquareRoot(a, b, c));

        double D = square1.Discriminant(a, b, c);
        if (D >= 0) {
            double x1 = square1.firstRoot(a, b, c);
            double x2 = square1.secondRoot(a, b, c);
            System.out.println("Square have roots: x1 = " + x1 + ", x2 = " + x2);

        } else {
            System.out.println("Square have't roots!");

        }


    }
}

package lv.javaguru.java1.student_timur_geldiev.lesson_5.classwork;

import java.util.Scanner;

public class SquareEquationApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first coefficient: ");
        double a = sc.nextDouble();
        System.out.println("Enter second coefficient: ");
        double b = sc.nextDouble();
        System.out.println("Enter third coefficient: ");
        double c = sc.nextDouble();

        SquareEquation eq1 = new SquareEquation(a, b,c);
        System.out.println("Discriminant is: " + eq1.findDiscriminant());
        System.out.println("Is it roots? " + eq1.isItRoots());
        System.out.println("First root is: " + eq1.findFirstRoot());
        System.out.println("Second root is: " + eq1.findSecondRoot());


    }
}

package lv.javaguru.java1.student_kristina_kisiluka.lesson_2.classwork;

import java.util.Scanner;

public class QuadraticEquationApp {

    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter first value - ");
        int a= sc.nextInt();
        System.out.print("Enter second value - ");
        int b= sc.nextInt();
        System.out.print("Enter third value - ");
        int c= sc.nextInt();
        System.out.println("Your quadratic equation is : " + a + "x^2" + "+" + b + "x" + "+" + c + "=0");
        int D = (b*b) - (4*a*c);
        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / 2 * a;
            double x2 = (-b - Math.sqrt(D)) / 2 * a;
            System.out.println("First x = " + x1);
            System.out.println("Second x = " + x2);
        }
        else {
            System.out.println("No roots");
        }
    }
}

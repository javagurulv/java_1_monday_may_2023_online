package lv.javaguru.java1.student_butrin_ilya.lesson_5.Classwork;

import java.util.Scanner;

public class SquareEquationApp {
    public static void main(String[] args) {


        SquareEquation squareEquation = new SquareEquation();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(squareEquation.isRoot(a,b,c));
        System.out.println(squareEquation.firstRoot(a,b,c));
        System.out.println(squareEquation.secondRoot(a,b,c));

    }
}

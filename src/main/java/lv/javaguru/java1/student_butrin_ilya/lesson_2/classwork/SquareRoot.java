package lv.javaguru.java1.student_butrin_ilya.lesson_2.classwork;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.println("number please");
        double num = in.nextDouble();
        double squareRoot = Math.sqrt(num);
        System.out.println("Square root from " + num + " = " + squareRoot);
    }
}
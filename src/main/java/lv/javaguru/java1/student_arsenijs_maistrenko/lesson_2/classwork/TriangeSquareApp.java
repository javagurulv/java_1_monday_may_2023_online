package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_2.classwork;

import java.util.Scanner;

public class TriangeSquareApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int aSide = in.nextInt();

        System.out.print("Input b: ");
        int bSide = in.nextInt();

        System.out.print("Input c: ");
        int cSide = in.nextInt();

        double p = (aSide + bSide + cSide) / 2;
        double square = Math.sqrt(p * (p - aSide)*(p- bSide)*(p-cSide));

        System.out.print("Triangle side: " + square);
    }
}

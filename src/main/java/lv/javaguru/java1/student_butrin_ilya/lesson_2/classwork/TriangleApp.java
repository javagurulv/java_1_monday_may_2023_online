package lv.javaguru.java1.student_butrin_ilya.lesson_2.classwork;

import java.util.Scanner;

public class TriangleApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number1, please:");
        int aSide = in.nextInt();
        System.out.print("Number2, please:");
        int bSide = in.nextInt();
        System.out.print("Number3, please:");
        int cSide = in.nextInt();

       double p = (aSide + bSide + cSide) / 2;

       double S = Math.sqrt(p * (p - aSide) * (p - bSide) * (p-cSide));

        System.out.println(S);

    }
}

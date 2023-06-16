package lv.javaguru.java1.student_butrin_ilya.lesson_2.homework.day3;

import java.util.Scanner;

public class ArithmeticMean {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Select num1 ");
        float num1 = in.nextFloat();
        System.out.print("Select num2 ");
        float num2 = in.nextFloat();
        System.out.print("Select num3 ");
        float num3 = in.nextFloat();
        Float Mean = (num1 + num2 + num3) / 3;
        System.out.println("Arithmetic mean = " + Mean);
    }
}

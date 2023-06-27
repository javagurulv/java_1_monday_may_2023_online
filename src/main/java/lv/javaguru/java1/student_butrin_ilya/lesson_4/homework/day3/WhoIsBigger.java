package lv.javaguru.java1.student_butrin_ilya.lesson_4.homework.day3;

import java.util.Scanner;

public class WhoIsBigger {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1 = number.nextInt();
        int num2 = number.nextInt();
        int num3 = number.nextInt();
        if (num1 > num2 || num1 == num2) {
            if (num1 > num3) System.out.println(num1);
            else if (num1 < num3) System.out.println(num3);
            else if (num1 == num3) System.out.println("BINGO");
        } else if (num1 < num2 || num1 == num2) {
            if (num2 < num3) System.out.println(num3);
            else if (num2 > num3) System.out.println(num2);
        }

    }

}
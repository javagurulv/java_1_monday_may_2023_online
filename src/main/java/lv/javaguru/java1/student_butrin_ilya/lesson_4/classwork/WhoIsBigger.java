package lv.javaguru.java1.student_butrin_ilya.lesson_4.classwork;

import java.util.Scanner;

public class WhoIsBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        boolean numberOneBigger = number1 > number2;
        boolean numberTwoBigger = number2 > number1;
        boolean equally = number1 == number2;
        if (numberOneBigger) {System.out.println("pervoe bolshe vtorogo");}
        if (numberTwoBigger) {System.out.println("vtoroe bolshe");}
        if (equally){System.out.println("ravni");}
}
}
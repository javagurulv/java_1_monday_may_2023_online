package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_4.day_6;

import java.util.Scanner;

public class RomanNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10: ");
        int romanNumbers = scanner.nextInt();

        switch (romanNumbers) {
            case 1:
                System.out.println(" I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println(" III");
                break;
            case 4:
                System.out.println(" IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println(" VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;

        }

    }
}

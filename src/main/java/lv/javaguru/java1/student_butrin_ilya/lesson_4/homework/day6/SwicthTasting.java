package lv.javaguru.java1.student_butrin_ilya.lesson_4.homework.day6;

import java.util.Scanner;

public class SwicthTasting {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        switch (number) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break ;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IV");
                break;
            case 10:
                System.out.println("X");
                break;
            default: System.out.println("only from 1 to ten");
        }
    }
}
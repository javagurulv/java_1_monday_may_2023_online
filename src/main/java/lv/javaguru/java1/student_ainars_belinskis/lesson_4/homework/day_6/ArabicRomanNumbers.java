package lv.javaguru.java1.student_ainars_belinskis.lesson_4.homework.day_6;

import java.util.Scanner;

public class ArabicRomanNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter arabic number (1-10): ");
        int number = scanner.nextInt();
        switch (number) {
            case (1):
                System.out.println("Arabic " + number + " - Roman I");
                break;
            case (2):
                System.out.println("Arabic " + number + " - Roman II");
                break;
            case (3):
                System.out.println("Arabic " + number + " - Roman III");
                break;
            case (4):
                System.out.println("Arabic " + number + " - Roman IV");
                break;
            case (5):
                System.out.println("Arabic " + number + " - Roman V");
                break;
            case (6):
                System.out.println("Arabic " + number + " - Roman VI");
                break;
            case (7):
                System.out.println("Arabic " + number + " - Roman VII");
                break;
            case (8):
                System.out.println("Arabic " + number + " - Roman VIII");
                break;
            case (9):
                System.out.println("Arabic " + number + " - Roman IX");
                break;
            case (10):
                System.out.println("Arabic " + number + " - Roman X");
                break;
            default:
                System.out.println("You entered a number greater than 10.");
        }
    }
}

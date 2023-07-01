package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_4.homework.day_6;

import java.util.Scanner;

public class ArabicToRomanConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Arabic numeral (1 to 10): ");
        int number = sc.nextInt();
        switch (number) {
            case (1): System.out.println("Arabic numeral: " + number + " = Roman numeral: I");
            break;
            case (2): System.out.println("Arabic numeral: " + number +  " = Roman numeral: II");
            break;
            case (3): System.out.println("Arabic numeral: " + number +  " = Roman numeral: III");
            break;
            case (4): System.out.println("Arabic numeral: " + number +  " = Roman numeral: IV");
            break;
            case (5): System.out.println("Arabic numeral: " + number + " = Roman numeral: V");
            break;
            case (6): System.out.println("Arabic numeral: " + number + " = Roman numeral: ");
            break;
            case (7): System.out.println("Arabic numeral: " + number + " = Roman numeral: VII");
            break;
            case (8): System.out.println("Arabic numeral: " + number + " = Roman numeral: VIII");
            break;
            case (9): System.out.println("Arabic numeral: " + number + " = Roman numeral: IX");
            break;
            case (10): System.out.println("Arabic numeral: " + number + " = Roman numeral: X");
                break;
            default: System.out.println("Invalid number!");
                break;

        }
    }

}
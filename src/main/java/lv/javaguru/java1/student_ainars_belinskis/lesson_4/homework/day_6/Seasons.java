package lv.javaguru.java1.student_ainars_belinskis.lesson_4.homework.day_6;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int number = scanner.nextInt();
        switch (number) {
            case (1):
                System.out.println("Month of January - Winter!");
                break;
            case (2):
                System.out.println("Month of February - Winter!");
                break;
            case (3):
                System.out.println("Month of March - Spring!");
                break;
            case (4):
                System.out.println("Month of April - Spring!");
                break;
            case (5):
                System.out.println("Month of May - Spring!");
                break;
            case (6):
                System.out.println("Month of June - Summer!");
                break;
            case (7):
                System.out.println("Month of July - Summer!");
                break;
            case (8):
                System.out.println("Month of August - Summer!");
                break;
            case (9):
                System.out.println("Month of September - Autumn!");
                break;
            case (10):
                System.out.println("Month of October - Autumn!");
                break;
            case (11):
                System.out.println("Month of November - Autumn!");
                break;
            case (12):
                System.out.println("Month of December - Winter!");
                break;
            default:
                System.out.println("There are only 12 months in a year.");
        }
    }
}

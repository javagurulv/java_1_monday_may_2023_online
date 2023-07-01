package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_4.homework.day_6;

import java.util.Scanner;

public class SeasonsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number (1 to 12): ");
        int number = sc.nextInt();
        switch (number) {
            case (1) ->
                    System.out.println("January is in the Winter.");
            case (2) ->
                System.out.println("February is in the Winter.");
            case (3) ->
                System.out.println("March is in the Spring.");
            case (4) ->
                System.out.println("April is in the Spring.");
            case (5) ->
                System.out.println("May is in the Spring.");
            case (6) ->
                System.out.println("June is in the Summer.");
            case (7) ->
                System.out.println("July is in the Summer.");
            case (8) ->
                System.out.println("August is in the Summer.");
            case (9) ->
                System.out.println("September is in the Autumn.");
            case (10) ->
                System.out.println("October is in the Autumn.");
            case (11) ->
                System.out.println("November is in the Autumn.");
            case (12) ->
                System.out.println("December is in the Winter.");

            default -> System.out.println("Invalid Month number");
        }
    }
}

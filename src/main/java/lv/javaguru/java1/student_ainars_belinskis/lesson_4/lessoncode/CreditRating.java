package lv.javaguru.java1.student_ainars_belinskis.lesson_4.lessoncode;

import java.util.Scanner;

public class CreditRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter credit rating: ");
        double rating = scanner.nextDouble();

        if (rating >= 700) {
            System.out.println("Interest rate is 5%");
        } else if (rating >= 650) {
            System.out.println("Interest rate is 7%");
        } else {
            System.out.println("Interest rate is 10%");
        }
    }
}

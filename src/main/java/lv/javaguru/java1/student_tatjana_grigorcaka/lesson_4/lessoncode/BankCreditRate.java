package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_4.lessoncode;

import java.util.Scanner;

class BankCreditRate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter credit rating: ");
        double creditRating = sc.nextDouble();

        if (creditRating > 700){
            System.out.println("Credit rate is 5%");
        } else if (creditRating >= 650 && creditRating <= 700) {
            System.out.println("Credit rate is 7%");
        } else if (creditRating < 650 && creditRating > 0) {
            System.out.println("Credit rate is 10%");
        } else {
            System.out.println("Invalid credit rating!");
        }
    }
}

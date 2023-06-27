package lv.javaguru.java1.student_timur_geldiev.lesson_4.classwork;

import java.util.Scanner;

public class CreditRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter client's credit rate - ");
        double rate = sc.nextDouble();

        if (rate > 700){
            System.out.println("Your interest rate is 5%");
        } else if (rate > 650 && rate < 700) {
            System.out.println("Your interest rate is 7%");
        } else if (rate < 650 && rate > 0) {
            System.out.println("Your interest rate is 10%");
        } else {
            System.out.println("Enter correct amount");
        }
    }
}

package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_5.day_3;

import java.util.Scanner;

class AmountOfTax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sum of money: ");
        double sum = scanner.nextInt();


        double sum1 = sum / 100 * 30;
        double sum2 = sum / 100 * 40;
        double sum3 = sum / 100 * 50;


        if (sum < 10000) {
           System.out.println("Tax 30% is: " + sum1);
        }
        else if (sum > 10000 && sum < 50000) {
            System.out.println("Tax 40% is: " + sum2);
        }
        else if (sum > 50000) {
            System.out.println("Tax 50% is: " + sum3);
    }







    }
}

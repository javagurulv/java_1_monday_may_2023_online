package lv.javaguru.java1.student_timur_geldiev.lesson_4.classwork;

import java.util.Scanner;

public class DiscountCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total price - ");
        double totalPrice = sc.nextDouble();
        double discount10 = 10;
        double discount20 = 20;

        if (totalPrice > 5000 && totalPrice <= 10000){
            double discounted = (discount10 / 100) * totalPrice;
            System.out.println(totalPrice - discounted);
        } else if (totalPrice > 10000) {
            double discounted = (discount20 / 100) * totalPrice;
            System.out.println(totalPrice - discounted);
        }
    }
}

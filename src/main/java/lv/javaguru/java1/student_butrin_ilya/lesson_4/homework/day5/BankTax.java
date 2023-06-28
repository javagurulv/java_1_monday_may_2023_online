package lv.javaguru.java1.student_butrin_ilya.lesson_4.homework.day5;

import java.util.Scanner;

public class BankTax {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        double beforTax = money.nextInt();
        double tax;
        if (beforTax < 1000 ) tax = beforTax / 100 * 97;
        else if (beforTax >=1000 && beforTax < 5000) tax = beforTax / 100 * 96;
        else tax = beforTax / 100 * 95;
        System.out.println(beforTax - tax);

    }
}

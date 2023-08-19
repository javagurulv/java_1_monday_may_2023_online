package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.lessoncode;


import lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.lessoncode.v1.PremiumCalculatorImpl;

import java.math.BigDecimal;
import java.util.Scanner;

public class UIPremiumCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter .... ");
        String policyNumber = scanner.nextLine();

        Policy policy = null; // get from user

        PremiumCalculator calculator = new PremiumCalculatorImpl();

        BigDecimal premium = calculator.calculate(policy);

        System.out.println(premium);
    }


}

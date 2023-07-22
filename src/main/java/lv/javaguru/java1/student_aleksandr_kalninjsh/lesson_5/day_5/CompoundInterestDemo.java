package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_5.day_5;

import java.util.Scanner;

public class CompoundInterestDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        CompoundInterest sum1 = new CompoundInterest();
        System.out.println(sum1.interest(depositAmount));
    }
}

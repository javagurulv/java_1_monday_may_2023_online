package lv.javaguru.java1.student_timur_geldiev.lesson_5.homework.day_5;

import java.util.Scanner;

public class CompoundInterest {
    public double compound(double income) {
        double r = 0.1; // Годовая процентная ставка 10%
        double n = 4; // Сколько раз в год учитывается процентная ставка - 4 раза в год
        double t = 10; // Число лет на которые оформлен вклад
        double percentage = (1 + (r / n));
        return income * Math.pow(percentage, n * t);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income amount: ");
        double income = sc.nextDouble();
        CompoundInterest check1 = new CompoundInterest();

        System.out.println("Your total amount after 10 years will be: " + check1.compound(income));
    }
}

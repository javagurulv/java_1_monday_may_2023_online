package lv.javaguru.java1.student_timur_geldiev.lesson_5.homework.day_7;

import java.util.Scanner;

public class C2F {

    public double convertC2F(double input) {
        return (input * 9 / 5) + 32;
    }

    public double convertF2C(double input) {
        return (input - 32) * ((double) 5 / 9);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your celsius degree: ");
        double celsius = sc.nextDouble();
        System.out.println("Enter your fahrenheit degree: ");
        double fahrenheit = sc.nextDouble();
        C2F conv = new C2F();

        System.out.println("Your celsius degree in fahrenheit will be : " + conv.convertC2F(celsius));
        System.out.println("Your fahrenheit degree in celsius will be : " + conv.convertF2C(fahrenheit));
    }
}

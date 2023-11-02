package lv.javaguru.java1.student_alexey_kosmachev.lesson_5.homework.day_3;

import java.util.Scanner;

public class CalculateTaxApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter annual income: ");
        int income = scanner.nextInt();
        CalculateTax newtax = new CalculateTax();
        System.out.println("You have to pay " + newtax.yourincome(income) + " EUR as a tax.");
    }
}

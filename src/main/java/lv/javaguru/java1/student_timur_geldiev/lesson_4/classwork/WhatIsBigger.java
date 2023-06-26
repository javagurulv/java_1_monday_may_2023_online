package lv.javaguru.java1.student_timur_geldiev.lesson_4.classwork;

import java.util.Scanner;

public class WhatIsBigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number - ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number - ");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("Biggest number is " + num1);
        }
        if (num2 > num1) {
            System.out.println("Biggest number is " + num2);
        }
        if (num1 == num2){
            System.out.println("Numbers are equal");
        }
    }
}

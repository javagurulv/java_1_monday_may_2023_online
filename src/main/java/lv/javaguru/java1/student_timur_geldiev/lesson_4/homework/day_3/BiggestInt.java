package lv.javaguru.java1.student_timur_geldiev.lesson_4.homework.day_3;

import java.util.Scanner;

class BiggestInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Biggest number is number 1 = " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Biggest number is number 2 = " + num2);
        } else if (num1 == num2 && num2 == num3) {
            System.out.println("Numbers are equal");
        } else if (num1 < num2 && num2 == num3) {
            System.out.println("There are two equal biggest numbers number 2 = " + num2 + " and number 3 = " + num3);

        } else if (num1 == num2 && num2 > num3) {
            System.out.println("There are two equal biggest numbers number 1 = " + num1 + " and number 2 = " + num2);
        } else if (num1 == num3 && num1 > num2) {
            System.out.println("There are two equal biggest numbers number 1 = " + num1 + " and number 3 = " + num3);

        } else {
            System.out.println("Biggest number is number 3 = " + num3);

        }

    }
}


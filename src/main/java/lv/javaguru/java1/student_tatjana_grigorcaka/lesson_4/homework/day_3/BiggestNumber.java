package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_4.homework.day_3;

import java.util.Scanner;

class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter number 3: ");
        int number3 = scanner.nextInt();


        if (number1 > number2 && number1 > number3) {
            System.out.println("The biggest number is: " + number1);
        }
        else if (number2 > number3 && number2 > number1) {
            System.out.println("The biggest number is: " + number2);
        }
        else if (number1 == number2 && number2 == number3) {
            System.out.println("Numbers are equal!");
        }
        else if (number1 > number2 && number1 == number3) {
            System.out.println("Two equal biggest numbers: " + number1 + " and " + number3);
        }
        else if (number2 > number3  && number2 == number1) {
            System.out.println("Two equal biggest numbers: " + number2 + " and " +  number1);
        }
        else if (number2 > number1 && number2 == number3) {
            System.out.println("Two equal biggest numbers: " + number2 + " and " +  number3);
        }
        else
            System.out.println("The biggest number is: "  + number3);
        }
    }


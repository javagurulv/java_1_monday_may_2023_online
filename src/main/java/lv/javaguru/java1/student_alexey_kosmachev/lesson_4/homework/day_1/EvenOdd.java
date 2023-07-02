package lv.javaguru.java1.student_alexey_kosmachev.lesson_4.homework.day_1;

import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int evenodd = number% 2;

        if (evenodd == 0) {System.out.println("Это четное число");}
        else {System.out.println("Это нечетное число");}
    }
}

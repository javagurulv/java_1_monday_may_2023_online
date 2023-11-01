package lv.javaguru.java1.student_alexey_kosmachev.lesson_4.homework.day_2;

import java.util.Scanner;

class EqualNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstnumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondnumber = scanner.nextInt();

        if (secondnumber == firstnumber) {System.out.println("Numbers are equals");}
        if (secondnumber != firstnumber) {System.out.println("Numbers are different");}


    }
}

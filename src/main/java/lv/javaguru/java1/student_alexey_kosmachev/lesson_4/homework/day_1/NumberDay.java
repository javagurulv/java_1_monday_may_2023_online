package lv.javaguru.java1.student_alexey_kosmachev.lesson_4.homework.day_1;

import java.util.Scanner;

class NumberDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7: ");
        int number = scanner.nextInt();

        if (((number >= 1) && (number <= 7))) {
            if (number == 1) { System.out.println("First day of the week is Monday");}
            if (number == 2) { System.out.println("Second day of the week is Tuesday");}
            if (number == 3) { System.out.println("Third day of the week is Wednesday");}
            if (number == 4) { System.out.println("Fourth day of the week is Thursday");}
            if (number == 5) { System.out.println("Fifth day of the week is Friday");}
            if (number == 6) { System.out.println("Six day of the week is Saturday");}
            if (number == 7) { System.out.println("Seventh day of the week is Sunday");}
        }
        else {System.out.println("Please enter number from 1 to 7");}
    }
}

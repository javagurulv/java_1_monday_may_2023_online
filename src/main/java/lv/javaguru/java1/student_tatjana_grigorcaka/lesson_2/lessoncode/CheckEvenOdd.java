package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_2.lessoncode;

import java.util.Scanner;

class CheckEvenOdd {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        if ( num % 2 == 0 )
            System.out.println("Even number");
        else
            System.out.println("Odd number");}

}

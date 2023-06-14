package lv.javaguru.java1.student_timur_geldiev.lesson_2.homework.day3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number you want to get multiplication table for - ");
        int number = sc.nextInt();

        System.out.println(number + " x " + 1 + " = " + (number));
        System.out.println(number + " x " + 2 + " = " + (number * 2));
        System.out.println(number + " x " + 3 + " = " + (number * 3));
        System.out.println(number + " x " + 4 + " = " + (number * 4));
        System.out.println(number + " x " + 5 + " = " + (number * 5));
        System.out.println(number + " x " + 6 + " = " + (number * 6));
        System.out.println(number + " x " + 7 + " = " + (number * 7));
        System.out.println(number + " x " + 8 + " = " + (number * 8));
        System.out.println(number + " x " + 9 + " = " + (number * 9));
        System.out.println(number + " x " + 10 + " = " + (number * 10));

    /*  int counter = 1;
        while (counter<=10){
            System.out.println(number + " x " + counter + " = " + (number * counter));
            counter += 1;

        } */
    }
}

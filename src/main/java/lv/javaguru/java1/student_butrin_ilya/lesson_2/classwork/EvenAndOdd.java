package lv.javaguru.java1.student_butrin_ilya.lesson_2.classwork;

import java.util.Scanner;

public class EvenAndOdd {
    public  static  void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number");
        int number = in.nextInt();
        if (number % 2 > 0) {
            System.out.println("odd");
        } else {
            System.out.println("even");

        }
    }
    }




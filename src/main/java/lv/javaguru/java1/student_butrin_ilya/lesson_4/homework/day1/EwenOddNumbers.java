package lv.javaguru.java1.student_butrin_ilya.lesson_4.homework.day1;

import java.util.Scanner;

public class EwenOddNumbers {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter you number");
        int enterNumber = number.nextInt();
        if (enterNumber % 2 == 1 || enterNumber % 2 == -1) System.out.println("Number is odd");
        else if (enterNumber % 2 == 0) System.out.println("Number is even");
        else System.out.println("I dont know");
    }
}

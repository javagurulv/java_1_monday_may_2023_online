package lv.javaguru.java1.student_butrin_ilya.lesson_4.homework.day2;

import java.util.Scanner;

public class WhoIsLess {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = number.nextInt();
        int num2 = number.nextInt();
        if(num1 < num2) System.out.println(num1 + " is less");
        else if(num1 > num2) System.out.println(num2 + " is less");
        else System.out.println("I dont now, that you want");
    }
}


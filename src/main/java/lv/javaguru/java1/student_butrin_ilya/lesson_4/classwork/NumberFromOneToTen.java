package lv.javaguru.java1.student_butrin_ilya.lesson_4.classwork;

import java.util.Scanner;

public class NumberFromOneToTen {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("enter you number:");
        int num = number.nextInt();
        if(num>= 1 && num <= 10) {System.out.println("DA");}
        else {System.out.println("NET");}
    }

}

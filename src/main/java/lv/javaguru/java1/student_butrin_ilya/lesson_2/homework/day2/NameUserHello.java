package lv.javaguru.java1.student_butrin_ilya.lesson_2.homework.day2;

import java.util.Scanner;

public class NameUserHello {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Print you name: ");
        String name = in.next();
        System.out.print("Hello" + " " + name);
    }
}
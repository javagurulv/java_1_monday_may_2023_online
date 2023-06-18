package lv.javaguru.java1.student_butrin_ilya.lesson_2.homework.day4;

import java.util.Scanner;

public class Print {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("you name");
        String name = in.next();
        System.out.println("you second name");
        String secondName = in.next();
        System.out.println(name);
        System.out.println(secondName);
        System.out.print(name + " ");
        System.out.print(secondName);
    }
}

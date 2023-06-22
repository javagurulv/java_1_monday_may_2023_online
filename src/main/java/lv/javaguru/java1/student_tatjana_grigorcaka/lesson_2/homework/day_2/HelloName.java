package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_2.homework.day_2;

import java.util.Scanner;
public class HelloName {
    public static void main(String[] args) {

        System.out.println("Please enter your name:");

        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.println("Hello " + name + "!");

    }

}

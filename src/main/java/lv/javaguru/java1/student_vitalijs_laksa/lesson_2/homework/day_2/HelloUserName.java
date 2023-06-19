package lv.javaguru.java1.student_vitalijs_laksa.lesson_2.homework.day_2;

import java.util.Scanner;
public class HelloUserName {
    public static void main(String[] args) {

        System.out.println("Please enter your name:");

        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.println("Hello " + name);

    }

}

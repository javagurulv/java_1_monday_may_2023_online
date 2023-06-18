package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_2.homework.day_2;

import java.util.Scanner;

public class HelloUsernameApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Write your username: ");
        String username = in.next();
        System.out.print("Hello " + username + "!");
    }
}

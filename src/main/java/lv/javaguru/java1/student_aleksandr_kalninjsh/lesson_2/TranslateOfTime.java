package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_2;

import java.util.Scanner;

public class TranslateOfTime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        int seconds = scanner.nextInt();

        int hour = 3600 / 3600;
        int min = (3665 % 3600) / 60;
        int sec = (3665 % 60 % 3600) % 60;

        System.out.println(hour + ":" + min + ":" + sec);



    }
}

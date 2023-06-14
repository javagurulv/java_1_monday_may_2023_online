package lv.javaguru.java1.student_timur_geldiev.lesson_2.classwork;

import java.util.Scanner;

public class TimeSwitchApp {

    public static void main (String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your amount of seconds: ");
        int totalSeconds = sc.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = (totalSeconds % 3600) % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}

package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_2.classwork;

import java.util.Scanner;

public class TimeChangeApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input time in sec: ");
        int fullTime = in.nextInt();
        int hour = fullTime / 3600;
        int min = fullTime - (3600 * hour);
        int min2 = min / 60;
        int sec = min - 60;
        System.out.print("Time is: " + hour + ":" + min2 + ":" + sec);
    }
}

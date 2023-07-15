package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_2.lessoncode;

import java.util.Scanner;

class TimeApp {

        public static void main(String[] args)   {

        Scanner in = new Scanner(System.in);
        System.out.print("Input Time in seconds: ");
        int inputTime = in.nextInt();

        int hour = inputTime / 3600;
        int min = (inputTime % 3600) / 60;
        int sec = (inputTime % 3600) % 60;

        System.out.println( hour + ":" + min + ":" + sec);
    }

}


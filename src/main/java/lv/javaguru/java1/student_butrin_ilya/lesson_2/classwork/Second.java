package lv.javaguru.java1.student_butrin_ilya.lesson_2.classwork;

import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("second please:");
        int sec = in.nextInt();
        int hour = sec / 3600;
        int min = (sec - (hour * 3600)) / 60;
        int secu = (sec - ((hour * 3600) + (min * 60)));
        System.out.print(hour + ":" + min + ":" + secu);


    }

}

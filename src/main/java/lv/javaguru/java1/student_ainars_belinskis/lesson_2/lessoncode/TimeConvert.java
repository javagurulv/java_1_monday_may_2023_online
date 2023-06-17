package lv.javaguru.java1.student_ainars_belinskis.lesson_2.lessoncode;

import java.util.Scanner;

public class TimeConvert {

    //как задать значение вводимого числа (секунд), чтоб можно было вводить много симвалов

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter how many seconds: ");
        int seconds = in.nextInt();

        int hour = seconds / 3600;
        int minutes = (seconds - (hour * 3600)) / 60;
        int seconds2 = (seconds - (hour * 3600) - (minutes * 60));

        System.out.println(hour + ":" + minutes + ":" + seconds2);

    }



}

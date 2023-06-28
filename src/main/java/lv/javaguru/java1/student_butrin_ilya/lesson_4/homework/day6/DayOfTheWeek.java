package lv.javaguru.java1.student_butrin_ilya.lesson_4.homework.day6;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);
        System.out.println("enter day number ");
        int dayNumber = day.nextInt();
        switch (dayNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default: System.out.println("принимаются числа только от 1 до 7");
        }
    }
}

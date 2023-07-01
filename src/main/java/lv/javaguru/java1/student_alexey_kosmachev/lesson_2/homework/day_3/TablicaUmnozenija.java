package lv.javaguru.java1.student_alexey_kosmachev.lesson_2.homework.day_3;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя целое число
//и печатает на консоль таблицу умножения.
class TablicaUmnozenija {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Write Number: "); //запрашиваем число у пользователя
        int Number = in.nextInt();

        System.out.println("1 x " + Number + " = " + 1 * Number);
        System.out.println("2 x " + Number +  " = " + 2 * Number);
        System.out.println("3 x " + Number +  " = " + 3 * Number);
        System.out.println("4 x " + Number +  " = " + 4 * Number);
        System.out.println("5 x " + Number +  " = " + 5 * Number);
        System.out.println("6 x " + Number +  " = " + 6 * Number);
        System.out.println("7 x " + Number +  " = " + 7 * Number);
        System.out.println("8 x " + Number +  " = " + 8 * Number);
        System.out.println("9 x " + Number +  " = " + 9 * Number);
        System.out.println("10 x " + Number +  " = " + 10 * Number);
    }


}

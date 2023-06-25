package lv.javaguru.java1.student_alexey_kosmachev.lesson_2.homework.day3;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя
//три целых числа и выводит их среднее арифметическое
//(складывает все числа и делит на их количество).
public class SredneeArifmet {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);

        System.out.print("input a: "); // запрашиваем число А
        int numberA = in.nextInt();

        System.out.print("input b: "); // запрашиваем число B
        int NumberB = in.nextInt();

        System.out.print("input c: "); //Запрашиваем число C
        int NumberC = in.nextInt();

        int Summ = numberA + NumberB + NumberC; // Определяем сумму чисел
        float SR = Summ / 3F; // Определяем среднее арифметическое

        System.out.println("Srednee = " + SR);
    }
}

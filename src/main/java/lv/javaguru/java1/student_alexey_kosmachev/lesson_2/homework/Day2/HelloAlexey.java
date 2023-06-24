package lv.javaguru.java1.student_alexey_kosmachev.lesson_2.homework.Day2;

import java.util.Scanner;

//Задание Написать консольную программу, которая запрашивает
//имя пользователя и выводит на консоль текст:
//Hello имя пользователя!
public class HelloAlexey {
    public static void main(String[]args) {
        Scanner sk = new Scanner(System.in);  //Задаем запрос текстовых данных от пользователя Scanner sk

        String Myname; // Задаем переменную
        System.out.print("input Name: "); // Получаем данные
        Myname = sk.nextLine();

        System.out.println("Hello " + Myname); // Вывод
    }
}

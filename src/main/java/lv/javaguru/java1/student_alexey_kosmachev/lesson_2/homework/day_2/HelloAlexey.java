package lv.javaguru.java1.student_alexey_kosmachev.lesson_2.homework.day_2;

import java.util.Scanner;

//Задание Написать консольную программу, которая запрашивает
//имя пользователя и выводит на консоль текст:
//Hello имя пользователя!
class HelloAlexey {
    public static void main(String[]args) {
        Scanner sk = new Scanner(System.in);  //Задаем запрос текстовых данных от пользователя Scanner sk

        String myname; // Задаем переменную
        System.out.print("input Name: "); // Получаем данные
        myname = sk.nextLine();

        System.out.println("Hello " + myname); // Вывод
    }
}

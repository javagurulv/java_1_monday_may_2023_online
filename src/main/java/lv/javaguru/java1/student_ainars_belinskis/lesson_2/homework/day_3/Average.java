package lv.javaguru.java1.student_ainars_belinskis.lesson_2.homework.day_3;


import java.util.Scanner;

public class Average {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.print("Введите три целых числа!\n");
            System.out.print("Число 1: ");
            double number1 = in.nextDouble();

            System.out.print("Число 2: ");
            double number2 = in.nextDouble();

            System.out.print("Число 3: ");
            double number3 = in.nextDouble();

            double average = (number1 + number2 + number3) / 3;
            System.out.println("Среднее арифметическое = " + average);


        }
    }


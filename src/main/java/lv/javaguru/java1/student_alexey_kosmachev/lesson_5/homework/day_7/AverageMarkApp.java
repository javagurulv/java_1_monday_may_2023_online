package lv.javaguru.java1.student_alexey_kosmachev.lesson_5.homework.day_7;

import java.util.Scanner;

class AverageMarkApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество студентов: ");

        AverageMark newList = new AverageMark();
        newList.writeStudentName();
        newList.writeStudentMark();
        System.out.println("Сумма всех оценок: " + newList.calculateSummMarks());
        newList.calculateAverageMarks();
        newList.calculateAboveAverageMarks();

        System.out.println("Программа завершена.");


    }
}
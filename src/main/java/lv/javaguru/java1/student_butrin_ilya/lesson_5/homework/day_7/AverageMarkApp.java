package lv.javaguru.java1.student_butrin_ilya.lesson_5.homework.day_7;

import java.util.Scanner;

public class AverageMarkApp {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите количество студентов: ");
                AvarageMark avarageMark = new AvarageMark();
             avarageMark.giveNames();
             avarageMark.giveMarks();
             avarageMark.midlMark();
             avarageMark.bestStudents();
                System.out.println("Программа завершена.");
            }
        }
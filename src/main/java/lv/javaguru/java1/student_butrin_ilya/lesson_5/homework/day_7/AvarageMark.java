package lv.javaguru.java1.student_butrin_ilya.lesson_5.homework.day_7;

import java.util.Scanner;

public class AvarageMark {

    Scanner scan = new Scanner(System.in);
    int studentCount = Integer.parseInt(scan.nextLine());
    String[] students = new String[studentCount];
    double[] marks = new double[studentCount];
    double sum = 0;
    double midlMark;
// обязательно ли тут объявлять все эти переменные или я что-то перемудрил?

    public String[] giveNames() {

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите имя студента " + (i + 1) + ": ");
            String studentName = scan.nextLine();
            students[i] = studentName;
        }
        return students;
    }

    public double[] giveMarks() {
        double[] marks = new double[studentCount];
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите оценку для студента " + students[i] + ": ");
            double mark = Double.parseDouble(scan.nextLine());
            this.marks[i] = mark;
        }
        return marks;
    }

    public double markSum() {
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        return sum;
    }

    public double midlMark() {
        this.midlMark = markSum() / studentCount;
        System.out.println("Средний балл: " + midlMark);
        return midlMark;
    }

    public void bestStudents() {
        System.out.println("Студенты со средним баллом выше среднего: ");
        for (int i = 0; i < studentCount; i++) {
            if (marks[i] > midlMark) {
                System.out.println(students[i]);
            }
        }
    }
}
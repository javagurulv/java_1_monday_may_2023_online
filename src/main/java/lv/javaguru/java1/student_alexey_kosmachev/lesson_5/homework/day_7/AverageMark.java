package lv.javaguru.java1.student_alexey_kosmachev.lesson_5.homework.day_7;

import java.util.Scanner;

class AverageMark {
    Scanner scanner = new Scanner(System.in);
    int studentCount = Integer.parseInt(scanner.nextLine());
    String[] students = new String[studentCount];;
    double[] grades = new double[studentCount];
    double sum = 0.0;
    double average;

    public String[] writeStudentName() {
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите имя студента " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students[i] = studentName;
        }
        return students;
    }
    public double[] writeStudentMark() {
    for (int i = 0; i < studentCount; i++) {
        System.out.print("Введите оценку для студента " + students[i] + ": ");
        double grade = Double.parseDouble(scanner.nextLine());
        grades[i] = grade;
    }
    return grades;
    }

    public double calculateSummMarks() {
    for (double grade : grades) {
        sum += grade;
    }
    return sum;
    }

    public double calculateAverageMarks() {
        double average = sum / studentCount;
        System.out.println("Средний балл: " + average);
        return average;
    }

    public void calculateAboveAverageMarks() {
        System.out.println("Студенты со средним баллом выше среднего:");
        for (int i = 0; i < studentCount; i++) {
            if (grades[i] > average) {
                System.out.println(students[i] + ": " + grades[i]);
            }
        }
    }

}
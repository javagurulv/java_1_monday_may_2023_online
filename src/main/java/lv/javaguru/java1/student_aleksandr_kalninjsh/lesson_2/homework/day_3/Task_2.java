package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_2.homework.day_3;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle radius: ");
        double radius = scanner.nextDouble();

        double perimetr = (2 * 3.14 * radius);
        double area = (3.14 * radius * radius);

        System.out.println("Circle perimetr is: " + perimetr);
        System.out.println("Circle area is: " + area);


    }
}

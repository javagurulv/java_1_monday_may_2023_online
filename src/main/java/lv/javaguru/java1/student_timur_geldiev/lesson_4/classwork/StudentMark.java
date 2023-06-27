package lv.javaguru.java1.student_timur_geldiev.lesson_4.classwork;

import java.util.Scanner;

public class StudentMark {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's mark - ");
        int mark = sc.nextInt();

        if (mark >= 90 && mark <= 100) {
            System.out.println("A");
        } else if (mark >= 80 && mark <= 89) {
            System.out.println("B");
        } else if (mark >= 70 && mark <= 79) {
            System.out.println("C");
        } else if (mark >= 60 && mark <= 69) {
            System.out.println("D");
        } else if (mark >= 0 && mark <= 59) {
            System.out.println("F");
        } else System.out.println("Student's mark can't be negative");
    }
}


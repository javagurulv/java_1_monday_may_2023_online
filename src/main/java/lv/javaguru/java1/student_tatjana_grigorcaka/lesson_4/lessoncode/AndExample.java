package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_4.lessoncode;

import java.util.Scanner;

class AndExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        if ((number >= 1) && (number <= 10)) {
            System.out.println("YES!");
        } else {
            System.out.println("NO!");
}
}}


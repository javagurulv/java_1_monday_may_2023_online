package lv.javaguru.java1.student_ainars_belinskis.lesson_4.lessoncode;

import java.util.Scanner;

class NumberTillTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        if ((number >= 1) && (number <= 10)) {
            System.out.println("Number is inside 10 range!");
        } else {
            System.out.println("Number is outside 10 range!");
        }
    }
}

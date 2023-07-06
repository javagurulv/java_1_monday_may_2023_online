package lv.javaguru.java1.student_ainars_belinskis.lesson_5.lessoncode;

import java.util.Scanner;

import static java.awt.SystemColor.text;

class EnterNumber {


    public int enterNumber() {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        return number;
    }
    public int enterNumber1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the number (text 1): ");
        int number = in.nextInt();
        return number;
    }
    public int enterNumber2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the number (text 2): ");
        int number = in.nextInt();
        return number;
    }
    public int enterNumber3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the number (text 3): ");
        int number = in.nextInt();
        return number;
    }
}

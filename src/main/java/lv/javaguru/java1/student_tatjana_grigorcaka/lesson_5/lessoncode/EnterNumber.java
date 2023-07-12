package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.lessoncode;

import java.util.Scanner;

class EnterNumber {

    public String text;

    public int enterNumberV1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the number 1: ");
        int number = sc.nextInt();
        return number;
    }
    public int enterNumberV2() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }

    public int enterNumberV3() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number; }

    public String getText() { return text; }

    public void setText(String text) { this.text = text; }
    }



package lv.javaguru.java1.student_timur_geldiev.lesson_5.classwork;

import java.util.Scanner;

public class MessageApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number1 = sc.nextInt();
        Message mes = new Message();
        mes.setMessage("Enter the number: ");
        System.out.println(mes.getMessage());
        int number2 = sc.nextInt();
    }
}

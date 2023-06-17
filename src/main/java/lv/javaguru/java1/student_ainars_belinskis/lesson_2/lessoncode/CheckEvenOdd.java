package lv.javaguru.java1.student_ainars_belinskis.lesson_2.lessoncode;

import java.util.Scanner;

public class CheckEvenOdd {
       public static void main(String[] args) {
               System.out.println("Введите число: ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if ( num % 2 == 0 )
            System.out.println("Число чётное");
        else
            System.out.println("Число нечётное");
    }
}



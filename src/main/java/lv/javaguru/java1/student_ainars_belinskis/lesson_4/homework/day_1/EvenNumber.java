package lv.javaguru.java1.student_ainars_belinskis.lesson_4.homework.day_1;

import java.util.Scanner;

class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();


        if (number % 2 == 0){
            System.out.println(number + " even number!!!");
        } else {
            System.out.println(number + " odd number!!!");
        }

    }
}

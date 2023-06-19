package lv.javaguru.java1.student_vitalijs_laksa.lesson_2.homework.day_3;

import java.util.Scanner;
public class Average {

        public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number 1 out of 3: ");
        int number1 = in.nextInt();
        System.out.print("Enter a number 2 out of 3: ");
        int number2 = in.nextInt();
        System.out.print("Enter a number 3 out of 3: ");
        int number3 = in.nextInt();

        int sum = number1 + number2 + number3;
        double avg = sum / 3.00;

        System.out.println("Your average number is: " + avg );
    }


}

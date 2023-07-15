package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_2.homework.day_3;

import java.util.Scanner;
class Average {

        public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();

        int sum = number1 + number2 + number3;
        double avg = sum / 3.00;

        System.out.println("Average: " + avg );
    }


}

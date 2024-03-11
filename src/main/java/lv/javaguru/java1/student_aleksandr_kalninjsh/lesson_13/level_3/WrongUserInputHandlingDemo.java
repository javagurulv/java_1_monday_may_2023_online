package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_13.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean correctNumber = false;

         while (!correctNumber) {
             try {
                 System.out.println("Enter your number: ");
                 number = scanner.nextInt();
                 correctNumber = true;
             } catch (InputMismatchException e) {
                 System.out.println("Wrong number! ");
                 scanner.nextLine();
             }
         }

        System.out.println("Number is correct! " + number);
    }
}
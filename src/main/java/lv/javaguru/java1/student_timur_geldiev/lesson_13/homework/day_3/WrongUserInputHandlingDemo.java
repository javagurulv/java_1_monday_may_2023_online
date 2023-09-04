package lv.javaguru.java1.student_timur_geldiev.lesson_13.homework.day_3;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean inputIsValid = false;

        while (!inputIsValid) {
            try {
                System.out.println("Enter your number");
                number = sc.nextInt();
                inputIsValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Wrong number, try again");
                sc.nextLine();
            }
        }
        System.out.println("You entered correct value " + number);
    }
}

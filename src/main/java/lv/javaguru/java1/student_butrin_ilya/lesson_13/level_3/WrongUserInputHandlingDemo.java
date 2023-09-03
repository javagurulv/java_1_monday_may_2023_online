package lv.javaguru.java1.student_butrin_ilya.lesson_13.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongUserInputHandlingDemo {
    public static void main(String[] args) throws InputMismatchException {
        Scanner scan = new Scanner(System.in);

        try {
            int a = scan.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("это не число");
        }
    }
}

package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_4.homework.day_2;
import java.util.Scanner;
public class BiggerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int first = scanner.nextInt();
        System.out.println("Enter the second number:");
        int second = scanner.nextInt();
        if (first > second) {
            System.out.println(first + " is bigger");
        } else  {
                System.out.println(second + " is bigger");
        }
    }

}
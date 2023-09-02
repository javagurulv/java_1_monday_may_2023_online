package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_4.homework.day_3;
import java.util.Scanner;
public class BiggerOfThree {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int first = scanner.nextInt();
    System.out.println("Enter the second number:");
    int second = scanner.nextInt();
    System.out.println("Enter the third number:");
    int third = scanner.nextInt();

    if ((first > second) && (first > third)) {
        System.out.print(first);
    } else if ((first > second) && (first < third)) {
        System.out.print(third);
    } else if ((first < second) && (second < third)) {
        System.out.print(third);
    } else {System.out.print(second);}
        System.out.println(" is biggest");

    }




}
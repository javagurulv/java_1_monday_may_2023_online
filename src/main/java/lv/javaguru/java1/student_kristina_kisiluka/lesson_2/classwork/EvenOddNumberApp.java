package lv.javaguru.java1.student_kristina_kisiluka.lesson_2.classwork;
import java.util.Scanner;
public class EvenOddNumberApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number= sc.nextInt();
        if (number % 2 == 0){
            System.out.println("Your integer is even");
        }else {
            System.out.println("Your integer is odd");
        }
    }
}


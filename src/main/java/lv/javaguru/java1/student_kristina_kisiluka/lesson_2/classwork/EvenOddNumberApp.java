package lv.javaguru.java1.student_kristina_kisiluka.lesson_2.classwork;
import java.util.Scanner;
public class EvenOddNumberApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int i = 0;
        System.out.print("Enter an integer: ");
        if (sc.hasNextInt()) {
            i = sc.nextInt();
            if (i%2 == 0){
                System.out.println("integer" + " " + i + " " + "even");
            } else {
                System.out.println("You entered an odd integer");
            }
        }
    }
}


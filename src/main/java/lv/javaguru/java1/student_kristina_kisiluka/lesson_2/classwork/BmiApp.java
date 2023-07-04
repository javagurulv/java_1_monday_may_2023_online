package lv.javaguru.java1.student_kristina_kisiluka.lesson_2.classwork;
import java.util.Scanner;
public class BmiApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in KG: ");

        int weight = scanner.nextInt();

        System.out.print("Enter height in meters: ");

        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("Body mass index: %.2fn", bmi);

        System.out.println("Underweight : less then 18,5");
        System.out.println("Normal: between 18,5 and 24,9");
        System.out.println("Overweight: between 25 and 29,9");
        System.out.println("Obesity: 30 or more");

    }
}

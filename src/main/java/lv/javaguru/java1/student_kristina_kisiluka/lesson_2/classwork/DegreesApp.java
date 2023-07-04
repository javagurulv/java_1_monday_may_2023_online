package lv.javaguru.java1.student_kristina_kisiluka.lesson_2.classwork;
import java.util.Scanner;
public class DegreesApp {
    public static void main (String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter temperature in Celsius - ");
        double C = sc.nextInt();

        double F = (C * 9 / 5) + 32;
        double K = C + 273.15;

        System.out.println("Your temperature in Fahrenheit is : " + F);
        System.out.println("Your temperature in Kelvin is : " + K);

    }
}

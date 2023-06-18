package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_2;

import java.util.Scanner;

public class BMICalculator {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();

        double bodyMassIndex = weight / (height * height);
        System.out.println("Body mass index is: " + bodyMassIndex);
    }
}

package lv.javaguru.java1.student_timur_geldiev.lesson_2.classwork;

import java.util.Scanner;

public class BmiApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height - ");
        float height = sc.nextInt();
        System.out.print("Enter your weight - ");
        float weight = sc.nextInt();

        float weightInGrams = weight * 10000;
        float BMI = weightInGrams / (height * height);
        if (BMI < 18.5) {
            System.out.println("Your BMI is " + BMI + " and you are underweight");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Your BMI is " + BMI + " and you have normal weight");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("Your BMI is " + BMI + " and you are overweight");
        } else if (BMI >= 30) {
            System.out.println("Your BMI is " + BMI + " and you have obesity");
        }
    }
}


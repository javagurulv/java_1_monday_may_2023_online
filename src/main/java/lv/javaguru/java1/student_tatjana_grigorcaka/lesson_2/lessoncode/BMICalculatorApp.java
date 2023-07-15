package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_2.lessoncode;

import java.util.Scanner;
class BMICalculatorApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input weight in kilos(kg): ");
        double weight = sc.nextDouble();
        System.out.print("Input height in metres(m): ");
        double height = sc.nextDouble();

        double BMI = weight/(height * height);

        System.out.println("Your Body Mass Index (BMI) is " + BMI);


        if(BMI < 18.5) {
            System.out.println("You are underweight!");}
        else if(BMI >= 18.5 && BMI < 24.9) {
            System.out.println("You are normal:)");}
        else if(BMI >= 25.0 && BMI < 29.9) {
            System.out.println("You are overweight!");}
        else if (BMI > 30) {
            System.out.println("You are obese!");}

    }
}


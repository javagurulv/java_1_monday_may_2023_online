package lv.javaguru.java1.student_butrin_ilya.lesson_2.classwork;

import java.util.Scanner;

import static java.lang.Math.pow;

public class BmiColculater {
    public  static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Height (m)");
        double height = in.nextDouble();
        System.out.println("Weight (kg)");
        double weight = in.nextDouble();
        double bmi = weight / (pow(height, 2));
        if (bmi < 16) {
            System.out.println(bmi + " very, very bad");
        } else if (bmi < 18.5) {
            System.out.println(bmi + " Thinness");
        } else if (bmi < 25) {
            System.out.println(bmi + " Norma");
        } else if (bmi < 30) {
            System.out.println(bmi + " Overweight");
        } else if (bmi < 35) {
            System.out.println(bmi + " Obese Class I");
        } else if (bmi < 40) {
            System.out.println(bmi + " Obese Class II");
        } else if (bmi > 40) {
            System.out.println(bmi + " Obese Class III");
        }

    }
}

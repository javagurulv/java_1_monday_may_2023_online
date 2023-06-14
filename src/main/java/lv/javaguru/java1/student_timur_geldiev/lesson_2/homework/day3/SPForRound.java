package lv.javaguru.java1.student_timur_geldiev.lesson_2.homework.day3;

import java.util.Scanner;

public class SPForRound {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter radius - ");
        double radius= sc.nextDouble();

        double pi = Math.PI;
        double P = 2 * pi * radius;
        double S = pi * (radius * radius);

        System.out.println("Perimeter of the round = " + P);
        System.out.println("Square of the round = " + S);
    }
}

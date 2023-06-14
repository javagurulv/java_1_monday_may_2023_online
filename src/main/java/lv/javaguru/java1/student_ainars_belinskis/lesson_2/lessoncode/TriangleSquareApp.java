package lv.javaguru.java1.student_ainars_belinskis.lesson_2.lessoncode;


import java.util.Scanner;
public class TriangleSquareApp {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.print("Input site A: ");
            double siteA = in.nextInt();

            System.out.print("Input site B: ");
            double siteB = in.nextInt();

            System.out.print("Input site C: ");
            double siteC = in.nextInt();

            System.out.println("A side = " + siteA);
            System.out.println("B side = " + siteB);
            System.out.println("C side = " + siteC);

            double p = (siteA + siteB + siteC) / 2;
            double square = Math.sqrt (p * (p - siteA) * (p - siteB) * (p - siteC));
            System.out.println("Triangle Square = "+ square);


        }
    }


package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.lessoncode;

import java.util.Scanner;

class SquareEquationApp {

    public static void main(String[] args) {
        int secondRoot = 0, firstRoot = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = in.nextInt();
        System.out.println("Enter the value of b: ");
        int b = in.nextInt();
        System.out.println("Enter the value of c: ");
        int c = in.nextInt();

        SquareEquation squareEquation1 = new SquareEquation();
        int d = (b * b) - (4 * a * c);
        System.out.println("Discriminant: " + squareEquation1.findDiscriminant(a, b, c));
        System.out.println("Roots: " + squareEquation1.isRoots(d));

        if (d >= 0) {
            System.out.println("First root: " + squareEquation1.findFirstRoot(a, b, c, d));
            System.out.println("Second root: " + squareEquation1.findSecondRoot(a, b, c, d));
        } else {
            System.out.println("No roots!!");
        }
    }
}

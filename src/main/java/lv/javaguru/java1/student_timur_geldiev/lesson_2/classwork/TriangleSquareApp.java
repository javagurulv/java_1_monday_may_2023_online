package lv.javaguru.java1.student_timur_geldiev.lesson_2.classwork;
import java.util.*;
public class TriangleSquareApp {

    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first side of triangle - ");
        int a= sc.nextInt();
        System.out.print("Enter second side of triangle - ");
        int b= sc.nextInt();
        System.out.print("Enter third side of triangle - ");
        int c= sc.nextInt();

        int P = a + b + c;
        double p = P / 2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("Perimeter or triangle = " + P);
        System.out.println("Square of triangle = " + S);
    }
}

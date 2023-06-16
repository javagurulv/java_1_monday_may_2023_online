package lv.javaguru.java1.student_butrin_ilya.lesson_2.homework.day3;

import java.util.Scanner;

public class SerclePS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
System.out.print("Sercle radius: ");
        float radius = in.nextFloat();
       float perimetr = 2 * 3.14F * radius ;
        float area = 3.14F * radius * radius;
             System.out.println("Perimeter is = " + perimetr);
             System.out.print("Area is = " + area);
    }
}

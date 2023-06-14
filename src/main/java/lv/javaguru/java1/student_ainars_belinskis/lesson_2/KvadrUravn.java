package lv.javaguru.java1.student_ainars_belinskis.lesson_2;


import java.util.Scanner;

public class KvadrUravn {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Программа решает квадратное уравнение вида:");
        System.out.println("ax^2 + bx + c = 0");

        System.out.println("Введите a:");
        double a = in.nextDouble();

        System.out.println("Введите b:");
        double b = in.nextDouble();

        System.out.println("Введите c:");
        double c = in.nextDouble();

       double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }

        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        }
        else {
            System.out.println("Уравнение не имеет действительных корней!");
        }


    }
}

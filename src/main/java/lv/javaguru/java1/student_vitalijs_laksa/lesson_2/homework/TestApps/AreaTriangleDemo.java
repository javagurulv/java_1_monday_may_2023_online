package lv.javaguru.java1.student_vitalijs_laksa.lesson_2.homework.TestApps;
import java.util.Scanner;

public class AreaTriangleDemo {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ширину треугольника: ");
        double base = scanner.nextDouble();

        System.out.println("Введите высоту треугольника: ");
        double height = scanner.nextDouble();

        //Площадь треугольника вычисляется по формуле = (width*height)/2
        double area = (base* height)/2;
        System.out.println("Площадь треугольника равна: " + area);
    }
}

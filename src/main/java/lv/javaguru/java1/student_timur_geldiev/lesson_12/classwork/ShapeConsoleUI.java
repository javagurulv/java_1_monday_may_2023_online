package lv.javaguru.java1.student_timur_geldiev.lesson_12.classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeConsoleUI {
    public static void main(String[] args) {

        List<Circle> circles = new ArrayList<>();
        List<Square> squares = new ArrayList<>();
        List<Rectangle> rectangles = new ArrayList<>();
        List<AbstractShape> shapes = new ArrayList<>();

        while ((true)) {
            System.out.println("Program menu:");
            System.out.println("1. Create circle:");
            System.out.println("2. Create square:");
            System.out.println("3. Create rectangle:");
            System.out.println("4. Calculate all shapes square:");
            System.out.println("5. Calculate all shapes perimeter:");
            System.out.println("6. Exit");

            Scanner sc = new Scanner(System.in);
            int userChoice = Integer.parseInt(sc.nextLine());

            if (userChoice == 1) {
                System.out.println("Enter circle radius:");
                int radius = Integer.parseInt(sc.nextLine());
                System.out.println("Enter circle name");
                String circleName = sc.nextLine();
                Circle circle = new Circle(circleName, radius);
                shapes.add(circle);
            }
            if (userChoice == 2) {
                System.out.println("Enter square side:");
                int a = Integer.parseInt(sc.nextLine());
                System.out.println("Enter square name");
                String squareName = sc.nextLine();
                Square square = new Square(squareName, a);
                shapes.add(square);
            }
            if (userChoice == 3) {
                System.out.println("Enter rectangle side a:");
                int a = Integer.parseInt(sc.nextLine());
                System.out.println("Enter rectangle side b:");
                int b = Integer.parseInt(sc.nextLine());
                System.out.println("Enter square name");
                String rectangleName = sc.nextLine();
                Rectangle rectangle = new Rectangle(rectangleName, a, b);
                shapes.add(rectangle);
            }
            if (userChoice == 4) {
                System.out.println("All shapes area = " + calculateAllShapesSquare(shapes));


            }
            if (userChoice == 5) {
                System.out.println("All shapes perimeter = " + calculateAllShapesPerimeter(shapes));

            }
            if (userChoice == 6) {
                System.out.println("Exit program!");
                break;
            }
        }
    }

    static double calculateAllShapesSquare(List<AbstractShape> shapes) {
        double area = 0;
        for (AbstractShape shape : shapes) {
            area += shape.calculateArea();
        }
        return area;
    }

    static double calculateAllShapesPerimeter(List<AbstractShape> shapes) {
        double perimeter = 0;
        for (AbstractShape shape : shapes) {
            perimeter += shape.calculatePerimeter();
        }
        return perimeter;
    }
}

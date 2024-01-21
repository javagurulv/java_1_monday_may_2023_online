package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_5;

import lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_4.*;

import java.util.Random;

class ShapeUtil {

    Random random = new Random();

    Circle createRandomCircle() {
        double radius = random.nextDouble(9);
        return new Circle("Circle", radius);
    }

    Square createRandomSquare() {
        double a = random.nextDouble(9);
        return new Square("Square", a);
    }

    Rectangle createRandomRectangle() {
        double a = random.nextDouble(9);
        double b = random.nextDouble(9);
        return new Rectangle("Rectangle", a, b);
    }

    Triangle createRandomTriangle() {
        double a = random.nextDouble(9);
        double b = random.nextDouble(9);
        double c = random.nextDouble(9);
        return new Triangle("Triangle", a, b, c);
    }

    Shape createRandomShape() {
        double randomNumber = random.nextDouble(9);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    double calculateArea(Shape[] shapes) {
        double areaSum = 0;
        for (Shape shape : shapes) {
            areaSum = areaSum + shape.calculateArea();
        }
        return areaSum;
    }

    public double calculatePerimeter(Shape[] shapes) {
        double perimeterSum = 0;
        for (Shape shape : shapes) {
            perimeterSum = perimeterSum + shape.calculatePerimeter();
        }
        return perimeterSum;
    }
    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}

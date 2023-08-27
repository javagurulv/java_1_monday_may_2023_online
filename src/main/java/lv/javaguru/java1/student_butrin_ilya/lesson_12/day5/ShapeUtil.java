package lv.javaguru.java1.student_butrin_ilya.lesson_12.day5;

import lv.javaguru.java1.student_butrin_ilya.lesson_12.day4.*;

import java.util.Random;

public  class ShapeUtil {
    Random random = new Random();

    Circle createRandomCircle() {
        int radius = random.nextInt(26145) + 1;
        Circle circle = new Circle("Random circle", radius);
        return circle;
    }
    Square createRandomSquare(){
        int side = random.nextInt(46340) + 1;
        Square square = new Square("Random scquare", side);
        return square;
    }
    Rectangle createRandomRectangle() {
        int sideA = random.nextInt(46340) + 1;
        int sideB = random.nextInt(46340) + 1;
        Rectangle rectangle = new Rectangle("Random rectangle", sideA, sideB);
        return rectangle;
    }
    Triangle createRandomTriangle(){
        int side = random.nextInt(46340) + 1;
        Triangle triangle = new Triangle("Random triangle", side);
        return triangle;
    }
    Shape createRandomShape() {
        int randomNumber = random.nextInt(4);
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
    double calculateArea(Shape[] shapes){
        double areaSum = 0;
        for (Shape shape : shapes) {
            areaSum = areaSum + shape.calculateArea();
        }
        return areaSum;
    }
    public double calculatePerimeter(Shape[] shapes){
        double perimetrSum = 0;
        for (Shape shape : shapes) {
            perimetrSum = perimetrSum + shape.calculateArea();
        }
        return perimetrSum;
    }
    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimetr();
    }
}

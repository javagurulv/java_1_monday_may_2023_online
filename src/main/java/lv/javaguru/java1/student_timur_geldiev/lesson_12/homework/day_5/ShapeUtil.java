package lv.javaguru.java1.student_timur_geldiev.lesson_12.homework.day_5;



import lv.javaguru.java1.student_timur_geldiev.lesson_12.homework.day_4.*;

import java.util.Random;

class ShapeUtil {

    private Random random;
    public ShapeUtil(){
        random = new Random();
    }

    public Circle createRandomCircle(){
        double radius = random.nextDouble(10);
        return new Circle("Circle", radius);
    }

    Square createRandomSquare(){
        int a = random.nextInt(10);
        return new Square("Square", a);
    }

    Rectangle createRandomRectangle(){
        int a = random.nextInt(10);
        int b = random.nextInt(10);
        return new Rectangle("Rectangle", a, b);

    }

    Triangle createRandomTriangle(){
        int a = random.nextInt(10);
        int b = random.nextInt(10);
        int c = random.nextInt(10);
        return new Triangle("Triangle", a, b, c);
    }

    Shape createRandomShape() {
        int randomNumber = random.nextInt(10);
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
        return shape.calculatePerimeter();
    }

}

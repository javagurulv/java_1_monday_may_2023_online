package lv.javaguru.java1.student_timur_geldiev.lesson_12.homework.day_5;

import lv.javaguru.java1.student_timur_geldiev.lesson_12.homework.day_4.Shape;

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shape1 = new ShapeUtil();
        Shape triangle = shape1.createRandomTriangle();
        double triangleArea = shape1.calculateArea(triangle);
        double trianglePerimeter = shape1.calculateArea(triangle);
        Shape square = shape1.createRandomSquare();
        double squareArea = shape1.calculateArea(square);
        double squarePerimeter = shape1.calculateArea(square);
        Shape circle = shape1.createRandomCircle();
        double circleArea = shape1.calculateArea(circle);
        double circlePerimeter = shape1.calculatePerimeter(circle);
    }
}

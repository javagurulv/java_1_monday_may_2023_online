package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_5;

import lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_4.Shape;

public class ShapeUtilDemo {

    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);

    }
}

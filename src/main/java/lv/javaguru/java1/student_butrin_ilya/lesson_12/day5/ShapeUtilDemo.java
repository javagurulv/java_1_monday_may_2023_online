package lv.javaguru.java1.student_butrin_ilya.lesson_12.day5;

import lv.javaguru.java1.student_butrin_ilya.lesson_12.day4.Shape;

public class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double triangleperimetr = shapeUtil.calculateArea(triangle);
            Shape square = shapeUtil.createRandomSquare();
            double squareArea = shapeUtil.calculateArea(square);
            double squarePerimetr = shapeUtil.calculateArea(square);
                Shape circle = shapeUtil.createRandomCircle();
                double circleArea = shapeUtil.calculateArea(circle);
                double circlePerimetr = shapeUtil.calculatePerimeter(circle);
                }
    }


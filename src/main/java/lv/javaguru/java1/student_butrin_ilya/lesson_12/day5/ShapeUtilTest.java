package lv.javaguru.java1.student_butrin_ilya.lesson_12.day5;

import lv.javaguru.java1.student_butrin_ilya.lesson_12.day4.Circle;
import lv.javaguru.java1.student_butrin_ilya.lesson_12.day4.Shape;
import lv.javaguru.java1.student_butrin_ilya.lesson_12.day4.Triangle;

public class ShapeUtilTest {

    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();

        Shape[] shapes = new Shape[4];
        for (int i = 0; i<shapes.length; i++)
        shapes[i] = shapeUtil.createRandomShape();

    }
}
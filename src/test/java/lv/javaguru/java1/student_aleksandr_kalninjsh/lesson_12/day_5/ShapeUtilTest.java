package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_5;

import lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_4.*;
;import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeUtilTest {

    ShapeUtil shapeUtil = new ShapeUtil();

    @Test
    public void createRandomCircle() {
        Circle circle = shapeUtil.createRandomCircle();
        assertEquals(circle.getTitle(), "Circle");
        assertTrue(circle.calculateArea() > 0);
        assertTrue(circle.calculatePerimeter() > 0);
    }

    @Test
    public void createRandomSquare() {
        Square square = shapeUtil.createRandomSquare();
        assertEquals(square.getTitle(), "Square");
        assertTrue(square.calculateArea() > 0);
        assertTrue(square.calculatePerimeter() > 0);
    }

    @Test
    public void createRandomRectangle() {
        Rectangle rectangle = shapeUtil.createRandomRectangle();
        assertEquals(rectangle.getTitle(), "Rectangle");
        assertTrue(rectangle.calculateArea() > 0);
        assertTrue(rectangle.calculatePerimeter() > 0);
    }

    @Test
    public void createRandomTriangle() {
        Triangle triangle = shapeUtil.createRandomTriangle();
        assertEquals(triangle.getTitle(), "Triangle");
        assertTrue(triangle.calculateArea() > 0);
        assertTrue(triangle.calculatePerimeter() > 0);
    }


}
package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RectangleTest {

    Rectangle rectangle = new Rectangle("Rectangle", 7, 5);

    @Test
    public void calculateArea() {
        double result = rectangle.calculateArea();
        assertEquals(result, 35);
    }
    @Test
    public void calculatePerimeter() {
        double result = rectangle.calculatePerimeter();
        assertEquals(result, 24);
    }
}

package lv.javaguru.java1.student_timur_geldiev.lesson_12.homework.day_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void calculatePerimeter() {
        double expected = 22;
        Rectangle rect1 = new Rectangle("Rectangle1", 5, 6);
        double actual = rect1.calculatePerimeter();
        assertEquals(expected, actual);
    }

    @Test
    void calculateArea() {
        double expected = 30;
        Rectangle rect2 = new Rectangle("Rectangle2", 5, 6);
        double actual = rect2.calculateArea();
        assertEquals(expected, actual);
    }
}
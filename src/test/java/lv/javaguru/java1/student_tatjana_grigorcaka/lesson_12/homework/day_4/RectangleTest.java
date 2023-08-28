package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_12.homework.day_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle rectangle = new Rectangle("Rectangle", 5, 8);

    @Test
    public void calculatePerimeter() {
        double result = rectangle.calculatePerimeter();
        assertEquals(result, 26);
    }

    @Test
    public void calculateArea() {
        double result = rectangle.calculateArea();
        assertEquals(result, 40);
    }


}
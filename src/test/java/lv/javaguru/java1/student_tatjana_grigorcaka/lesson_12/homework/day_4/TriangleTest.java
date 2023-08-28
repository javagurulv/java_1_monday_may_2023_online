package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_12.homework.day_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    private Triangle triangle = new Triangle("Triangle", 5);

    @Test
    public void calculatePerimeter() {
        double result = triangle.calculatePerimeter();
        assertEquals(result, 15);
    }

    @Test
    public void calculateArea() {
        double result = triangle.calculateArea();
        assertEquals(result, 10.825317547305483);
    }

}
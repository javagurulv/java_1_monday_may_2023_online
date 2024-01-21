package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    Triangle triangle = new Triangle("Triangle", 8, 8, 8);

    @Test
    public void calculateArea() {
        double result = triangle.calculateArea();
        assertEquals(result,27.712812921102035 );
    }
    @Test
    public void calculatePerimeter() {
        double result = triangle.calculatePerimeter();
        assertEquals(result, 24);
    }
}

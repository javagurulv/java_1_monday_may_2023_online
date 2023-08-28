package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_12.homework.day_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private Circle circle = new Circle("Circle", 5);

    @Test
    public void calculatePerimeter() {
        double result = circle.calculatePerimeter();
        assertEquals(result, 31.41592653589793);
    }

    @Test
    public void calculateArea() {
        double result = circle.calculateArea();
        assertEquals(result, 78.53981633974483);
    }





}
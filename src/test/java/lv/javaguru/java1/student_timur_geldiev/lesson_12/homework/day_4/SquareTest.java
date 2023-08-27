package lv.javaguru.java1.student_timur_geldiev.lesson_12.homework.day_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void calculatePerimeter() {
        double expected = 20;
        Square sqr1 = new Square("Square1", 5);
        double actual = sqr1.calculatePerimeter();
        assertEquals(expected, actual);
    }

    @Test
    void calculateArea() {
        double expected = 25;
        Square sqr2 = new Square("Square2", 5);
        double actual = sqr2.calculateArea();
        assertEquals(expected, actual);
    }
}
package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_12.homework.day_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    private Square square = new Square("Square", 5);

    @Test
    public void calculatePerimeter() {
        double result = square.calculatePerimeter();
        assertEquals(result, 20);
    }

    @Test
    public void calculateArea() {
        double result = square.calculateArea();
        assertEquals(result, 25);
    }

}
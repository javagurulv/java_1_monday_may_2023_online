package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    Square square = new Square("Square", 3);

    @Test
    public void calculateArea() {
        double result = square.calculateArea();
        assertEquals(result, 9);
    }
    @Test
    public void calculatePerimeter() {
        double result = square.calculatePerimeter();
        assertEquals(result, 12);
    }
}

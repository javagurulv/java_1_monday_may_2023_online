package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    Circle circle = new Circle("Circle", 7);

    @Test
    public void calculateArea() {
        double result = circle.calculateArea();
        assertEquals(result, 153.93804002589985);
    }
    @Test
    public void calculatePerimeter() {
        double result = circle.calculatePerimeter();
        assertEquals(result, 43.982297150257104);
    }
}

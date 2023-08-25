package lv.javaguru.java1.student_timur_geldiev.lesson_12.homework.day_4;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void calculateArea() {
        double expected = 14.7;
        Triangle trng1 = new Triangle("Triangle1", 5,6,7);
        double actual = trng1.calculateArea();
        DecimalFormat df = new DecimalFormat("#.##");
        double roundedActual = Double.parseDouble(df.format(actual));
        assertEquals(expected, roundedActual);
    }

    @Test
    void calculatePerimeter() {
        double expected = 18;
        Triangle trng2 = new Triangle("Triangle2", 5,6,7);
        double actual = trng2.calculatePerimeter();
        assertEquals(expected, actual);
    }
}
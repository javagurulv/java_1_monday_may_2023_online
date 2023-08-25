package lv.javaguru.java1.student_timur_geldiev.lesson_12.homework.day_4;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void calculatePerimeter() {
        double expected = 31.42;
        Circle circle1 = new Circle("Circle1", 5);
        double actual = circle1.calculatePerimeter();
        DecimalFormat df = new DecimalFormat("#.##");
        double roundedActual = Double.parseDouble(df.format(actual));
        assertEquals(expected, roundedActual);
    }

    @Test
    void calculateArea() {
        double expected = 78.54;
        Circle circle2 = new Circle("Circle2", 5);
        double actual = circle2.calculateArea();
        DecimalFormat df = new DecimalFormat("#.##");
        double roundedActual = Double.parseDouble(df.format(actual));
        assertEquals(expected, roundedActual);
    }
}
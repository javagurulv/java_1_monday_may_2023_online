package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahrenheitConverterTest {

    FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();

    @Test
    public void convertPlus20Degree() {
        double result = fahrenheitConverter.convert(20);
        assertEquals(result, 68);
    }

    @Test
    public void convertMinus10Degree() {
        double result = fahrenheitConverter.convert(-10);
        assertEquals(result, 14);
    }

    @Test
    public void convertZeroDegree() {
        double result = fahrenheitConverter.convert(0);
        assertEquals(result, 32);
    }

}
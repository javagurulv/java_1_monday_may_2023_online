package lv.javaguru.java1.student_timur_geldiev.lesson_11.homework.day_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahrenheitConverterTest {

    @Test
    void convert() {
        double expected = 212;
        TemperatureConverter temp = new FahrenheitConverter();
        double actual = temp.convert(100);
        assertEquals(expected, actual);
    }
}
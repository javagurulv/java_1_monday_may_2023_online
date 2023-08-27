package lv.javaguru.java1.student_timur_geldiev.lesson_11.homework.day_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KelvinConverterTest {

    @Test
    void convert() {
        double expected = 373.15;
        TemperatureConverter temp = new KelvinConverter();
        double actual = temp.convert(100);
        assertEquals(expected, actual);
    }
}
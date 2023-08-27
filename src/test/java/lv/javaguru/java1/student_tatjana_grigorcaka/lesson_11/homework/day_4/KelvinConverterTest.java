package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KelvinConverterTest {

    KelvinConverter kelvinConverter = new KelvinConverter();

    @Test
    public void convertPlus20Degree() {
        double result = kelvinConverter.convert(20);
        assertEquals(result, 293.15);
    }


    @Test
    public void convertMinus10Degree() {
        double result = kelvinConverter.convert(-10);
        assertEquals(result, 263.15);
    }

    @Test
    public void convertZeroDegree() {
        double result = kelvinConverter.convert(0);
        assertEquals(result, 273.15);
    }

}
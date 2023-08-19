package lv.javaguru.java1.student_butrin_ilya.lesson_11.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    @Test
    public void testCell() {
        TemperatureConverter cell = new CelsiusConverter();
        double real = 10;
        double expected = cell.convert(10);
        assertEquals(real, expected);
    }

    @Test
    public void testKelvin() {
        TemperatureConverter kalvin = new KelvinConverter();
        double real = 373.15;
        double expected = kalvin.convert(100.0);
        assertEquals(real, expected);
    }

    @Test
    public void testFeringate() {
        TemperatureConverter kalvin = new FeringeitConverter();
        double real = 50.0;
        double expected = kalvin.convert(10.0);
        assertEquals(real, expected);

    }
}
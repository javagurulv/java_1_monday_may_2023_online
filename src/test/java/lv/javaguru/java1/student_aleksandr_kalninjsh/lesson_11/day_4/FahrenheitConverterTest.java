package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_11.day_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahrenheitConverterTest {

    FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();

    @Test
    public void fahrenheit() {
        double result = fahrenheitConverter.convert(27);
        assertEquals(result, 80.6);
    }


}
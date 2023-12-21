package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_11.day_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KelvinConverterTest {

    KelvinConverter kelvinConverter = new KelvinConverter();

    @Test
    public void kelvin() {
        double result = kelvinConverter.convert(31);
        assertEquals(result, 304.15);


    }

}